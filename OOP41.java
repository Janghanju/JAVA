package BIT01;

public class OOP41 {
	public static void main(String[] args) {
        int a=10;
        int b=20;
        // a+b=?
        int v=sum(a,b); //메서드 호출(Method Call) -->제어권이 이동
        System.out.println(v);
	}
	// 2개의 정수를 매개변수로 받아서 총합을 구하여 출력하는 메서드를 정의하시오.
	public static int sum(int x,int y){
		int hap=x+y;
		//System.out.println(hap);	
		return hap;
	}	
}