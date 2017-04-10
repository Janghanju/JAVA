package BIT01;

public class OOP02 {

	public static void main(String[] args) {
		
	  //float a = (float)24.1234578911111;
		float a = 24.1234578911111f; //float은 부동소수점 7자까
		System.out.println(a);
		
		double b = 24.1234578911111; //double은 부동소수점 14
		System.out.println(b);
		
		float c = (float) 24.61111111111111; // 24.6(double) --> float : 강제행변환 정보 손실있
		System.out.println(c);
		
	}

}
