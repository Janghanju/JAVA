package BIT01;

public class OOP15 {

	public static void main(String[] args) {
		// 삼항연산자( a ? b : c )
		int a=5;
		String str = (a%2==0) ? "짝수" : "홀수";
		System.out.println(str);
		
		// 대입, 할당 연산자(=)
		int b;
		int c;
		int d;
		b=c=d=20;
		System.out.println(b);
		
		// 복합대입연산자(+=, -=, *=, /=, %=)
		int x=0;
		x=x+1;
		x+=1;
		System.out.println(x);
		
		
	}

}
