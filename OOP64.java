package BIT02;

public class OOP64 {
	//정보올림피아드 알고리즘
	public static void main(String[] args) {
		
		int v = f(10, f(3,7));
		
		System.out.println(v);
		
	}
	
	public static int f(int a, int b){
		
		if(a > b){
			return a-b;
		}else return b-a;
	
	}
}
