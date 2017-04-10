package BIT01;

public class OOP03 {

	public static void main(String[] args) {

		int a = 'A';
		System.out.println((char)a);
		
		char b = 'B';
		
		int d = b + 1;
		System.out.println((char)d);
		
		char lower = 'd';
		int upper = (int)lower - 32;
		System.out.println((char)upper); //'D'
		
		String s = "apple";
		
		int ex0 = s.charAt(0) - 32;
		int ex1 = s.charAt(1) - 32;
		int ex2 = s.charAt(2) - 32;
		int ex3 = s.charAt(3) - 32;
		int ex4 = s.charAt(4) - 32;
		
		System.out.print((char)ex0); // A
		System.out.print((char)ex1); // P
		System.out.print((char)ex2); // P
		System.out.print((char)ex3); // L
		System.out.println((char)ex4); // E
		
		int han = '박';
		System.out.println(han); // 유니코드
	}
}
