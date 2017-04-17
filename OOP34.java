package BIT01;

public class OOP34 {

	public static void main(String[] args) {
		
		// 카운트하는 방법(짝수의 개수,홀수의 개수)
		
		int even = 0; //짝수
		int odd = 0; //홀수
		int[] a = {4,3,1,2,5};
		
		for(int i=0;i<a.length;i++){
			if(a[i]%2==0) even ++;
			if(a[i]%2==1) odd ++;
		} System.out.println(even);
		  System.out.println(odd);
		//
	
		//"apple"를 대문자로 바꾸시오
	
		  char[] c={'a','p','p','l','e'}; 

		  for(int i=0;i<c.length;i++){
			  char up = (char) (c[i] - 32);
			  System.out.print(up);
		  } System.out.println();
		//
	
	}
}
