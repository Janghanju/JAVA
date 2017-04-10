package BIT01;

public class OOP12 {

	public static void main(String[] args) {
		
		int a=12;
		String str=(a%2==0 && a%3==0) ? "2배수이면서 3의배수" : "아님";
		System.out.println(str);
		
		int x='1';
		int y='2';
		System.out.println(x); // '1' = 49
		System.out.println(y); // '2' = 50
		int sum=(x-'0')+(y-'0');
		System.out.println(sum);
	}

}
