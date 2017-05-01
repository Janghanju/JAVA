package BIT01;

public class OOP45 {

	public static void main(String[] args) {
		
		int[] a = {4,3,1,2,5}; // 15
		total(a);
		
	}
	// 매개변수로 정수형 배열을 받아서 배열에 모든 원소의 총합을 구하여출력하는 매서드를 정의하라. (total)
	public static void total(int[] arr){ // arr.length
		
		int sum = 0;
		for(int i=0; i<arr.length; i++){
			sum += arr[i];
		}
		System.out.println(sum);
	
	}
}
