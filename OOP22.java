package BIT01;

public class OOP22 {

	public static void main(String[] args) {
		
		for(int i=0;i<5;i++){
			System.out.println("#");
		}
		
		int j=0;
		while(j<5){
			System.out.println("$");
			j++;
		}
		int x=0;
		do{
			System.out.println("*");
			x++;
		}while(x<5);
	// 1~10까지의 수중 짝수만 출력하시오(for, continue)
	for(int i=1;i<11;i++){
		if(i%2!=1) continue;
		System.out.println(i);
		}
	}
}