package BIT02;

public class OOP81 {

	public static void main(String[] args) {
		
		int[] a = {3,8,12,16,21,39,40};
		// 2의 배수이면서 3의 배수인 수를 출력하시오
		
		for(int i=0; i<a.length; i++){
			if(a[i]%2 == 0 && a[i]%3 == 0){
				System.out.println(a[i]);
			}
		}
		
	}

}
