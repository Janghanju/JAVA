package BIT02;

public class OOP92 {

	public static void main(String[] args) {
		
		int[] list = {1,2,3,4,5};
		
		int vl = arrHap(list);
		
		System.out.println(vl); // a배열의 총합
		arr_2(list); // 2
	}
	// 매개변수로 정수형 1차원 배열을 받아서 총합을 구하여 리턴하는 매서드를 정의(arrHap)
	
	public static int arrHap(int[] x){
		int sum = 0;
		for(int i : x){
			sum += i;
		}
		
		return sum;
	}
	// 매개변수로 정수형 1차원 배열을 받아서 배열원소중 짝수의 개수를 구하여 출력(evenCnt)
	
	public static void arr_2(int[] a){
		int cnt = 0;
		for(int i : a){
			if(i%2 == 0){
				cnt ++;
			}
		}
		System.out.println(cnt);
	}
}
