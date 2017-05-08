package BIT02;

public class OOP49 {

	public static void main(String[] args) {
		
		//Q)정수3개를 저장하기 위해 기억공간 3개를 연속적으로 만들어보세요
		
		int[] a = new int[3];
		a[0] = 10;
		a[1] = 20;
		a[2] = 30;
		//System.out.println(a[0] + a[1] + a[2]);
		
		// for문을 이용하여 배열의 모든원소의 값을 더하여 출력하시오.
		
		int sum = 0;
		for(int i=0; i<a.length; i++){
			sum += a[i];
		}
		System.out.println(sum);
	}

}

/*
 * - 배열(Array) 
 * 	 1, 1차원 배
 * - 매서드(Method)
 */