package BIT02;

public class OOP66 {

	public static void main(String[] args) {
		//정보올림피아드 알고리즘		재귀함수
		int v = f(10);
		System.out.println(v); //55
		
	}
	
	public static int f(int n){
		
		if(n==1){
			return 1;
		}else{
			return n+f(n-1);
				//10 + 9 + 8 + 7 + 6 + 5 + 4 + 3 + 2 + 1 = 55
		}
	}

}
