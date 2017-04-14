package BIT01;

public class OOP31 {

	public static void main(String[] args) {
		
		int[] a={4,3,1,2,5};
		//배열에서 짝수만 출력
		
		for(int i=0;i<a.length;i++){
			if(a[i]%2==0){
				System.out.println(i);
			}
		}
		
		for(int i:a){
			if(i%2==0){
				System.out.println(i);
			}
		}
		
		
	}
}
