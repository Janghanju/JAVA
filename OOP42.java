package BIT01;

public class OOP42 {
	public static void main(String[] args) {

		float v=hap(234.5f, 2145.7f);
		System.out.println(v);
	}
	//Q) 매개변수로 실수2개를 받아서 총합을 구한 후 리턴하는 메서드를 정의하시오(hap)
	public static float hap(float a, float b){
		float c=a+b;
		return c;
	}
}