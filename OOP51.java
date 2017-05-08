package BIT02;

public class OOP51 {

	public static void main(String[] args) {
		
		char[] a = {'a','p','p','l','e'};
		// 배열의 모든 원소를 대문자로 변경하여 APPLE을 출력하시오.
		
		for(int i=0; i<a.length; i++){
			//System.out.print((char)(a[i] - 32));
		}
		
		char[] c = {'A','p','P','L','e'};
		// 배열에서 대문자만 출력하시오
		
		for(int i=0; i<c.length; i++){
			if(c[i] <= 90 && c[i] >=65){ // A(65) ~ Z(90)
				System.out.print(c[i]);
			}
		}
		
	}

}
