package BIT02;

public class OOP52 {

	public static void main(String[] args) {
		
		int[] a = {4,7,9,12,14,16,17,19,21};
		// 2의 배수이면서 3의배수인 수만 출력하시오
		
		for(int i=0; i<a.length; i++){
			if(a[i]%2 == 0 && a[i]%3 == 0){
				System.out.println(a[i]);
			}
		}
		
		// 위 배열에서 짝수이면 "박수"를, 홀수이면 "으악"을 출력하시오
		
		for(int i=0; i<a.length; i++){
			if(a[i]%2 == 0){
				System.out.println("박수");
			}else{
				System.out.println("으악");
			}
		}
		
	}

}
