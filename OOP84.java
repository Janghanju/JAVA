package BIT02;

public class OOP84 {

	public static void main(String[] args) {
		
		int[] a = {1,2,3,4,5,6,7,8,9};
		// 짝수의 합과 홀수의 합의 곱을 구하시오
		
		int value1 = 0;
		int value2 = 0;
		int main_value;
		
		for(int num : a){
			if(num%2 == 0){
				value1 += num;
			}else{
				value2 += num;
			}
		}		
		
		main_value = value1 * value2;
		
		System.out.println("짝수의 합 = " + value1);
		System.out.println("홀수의 합 = " + value2);
		
		System.out.println("정답 " + main_value);
	}

}
