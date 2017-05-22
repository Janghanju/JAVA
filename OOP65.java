package BIT02;

public class OOP65 {

	public static void main(String[] args) {
		//정보올림피아드 알고리즘		재귀함수
		int v = f(6);
		System.out.println(v);
	
	}
	
	public static int f(int a){
		if(a <= 2){
			return a;
		}else{
			return f(a-1) * f(a-2);
		}
					//f(5) * f(4)
					//{f(4) * f(3)} * {f(3) * f(2)}
					//{f(3) * f(2)} * {f(2) * f(1)} * {f(2) * f(1)} * 2
					//{f(2) * f(1)} * 2(2*1) * (2 * 1) * 2 
	}

}
