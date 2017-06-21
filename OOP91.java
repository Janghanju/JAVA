package BIT02;

public class OOP91 {

	public static void main(String[] args) {
		int a = 100;
		int b = 200;
		
		int vl = add(a, b);
		System.out.println(vl);
		
		float _a = 100.00001f;
		float _b = 200.00002f;
		
		System.out.println(add(_a, _b)); // parameter passing(매개변수 전달)
		
		//					Call By value : 값전달방법
	}
	
	// 매개변수로 정수 2개를 받아서 총합을 구하여 리턴하는 메서드를 만드시오. (add)
	
	public static int add(int x, int y){ // add 중복 사용가능 = Method Overloading(중복정의)
		int _vl = x + y;
		
		return _vl;
	}
	
	// 매개변수로 실수 2개를 받아서 총합을 구하여 리턴하는 매서드를 만드시오. (add)
	
	public static float add(float x, float y){ // add 중복 사용가능 = Method Overloading(중복정의)
		float value = x + y;
		
		return value;
	}
	
}