package BIT01;
public class OOP47 {
public static void main(String[] args) {

int[] jum = {70,60,90,81,55};
int[] rank = new int[jum.length];


for(int i=0; i<jum.length; i++){
int r=1; //1등이라고 생각하고 시작
for(int j=0; j<jum.length; j++){
if(jum[i] < jum[j]){
r = r+1; //등수가 뒤로 밀려난다.
}
}
rank[i] = r;
}

System.out.println("정수\t석차");

for(int i=0; i<jum.length; i++){
System.out.println(jum[i] + "\t" + rank[i]);
}
}
}
/*
 * 점수 석차(rank)
 * 70 : 3
 * 60 : 4
 * 90 : 1
 * 81 : 2
 * 55 : 5
*/
