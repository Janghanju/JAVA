package BIT02;

public class OOP67 {

	public static void main(String[] args) {
		//정보올림피아드 알고리즘		재귀함수
		f(100);
		System.out.println();
	}
	
	static int c = 0;
	public static void f(int n){

		if(n<=1){
			c++;
			System.out.println(n);// 
		}else{		// [1]  [2]   [3]   [4]   [5]   [6]   [7]
			f(n/2); //f(50) f(25) f(12) f(6)  f(3)  f(1)  c = 1	
					// [1]   [2]  [3]   [4]   [5]	[6]  [7]  [8]   [9]  [10]  [11]
			f(n/2); // c = 2 f(1) c = 3 f(1)  c = 4 f(2) f(1) c = 5 f(2) f(1) c = 6
		}
	}

}
