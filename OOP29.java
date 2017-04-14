package BIT01;

public class OOP29 {

	public static void main(String[] args) {
		// 배열(Array) - 자료구
		
		// 정수 3개를 저장할 기억공간을 만드시오.
		
		// 배열의 형태로 기억공간을 드시오.
		int[] a=new int[3];
		a[0]=10;
		a[1]=20;
		a[2]=30;
		
		//length는 배열의 개
		
		for(int i=0;i<a.length;i++){
			System.out.println(a[i]);
		}
		System.out.println(a.length);
		
	}

}
