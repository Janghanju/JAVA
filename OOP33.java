package BIT01;

public class OOP33 {

	public static void main(String[] args) {
		
		// 모든원소에 10을 저장하시오.
		
		int[] a = new int[3];
		
		for(int i=0;i<a.length;i++){
			a[i] = 10;
			System.out.println(a[i]);
		}System.out.println();
		//
		
		int[] b = {10,10,10};
		
		//모든원소의 총합을 구하시오.
		
		int sum = 0;
		for(int i=0;i<b.length;i++){
			sum += b[i];
		}System.out.println(sum);
		//
		
	}
}
