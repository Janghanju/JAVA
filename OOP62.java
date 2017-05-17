package BIT02;

public class OOP62 {

	public static void main(String[] args) {
		//정보올림피아드 알고리즘
		
		int[] a = new int [10];
		
		a[1] = 1;
		a[2] = 1;
		
		for(int i=3; i<10; i++){
			a[i] = a[i-1] + a[i-2] + 1;
		}
		System.out.println(a[7]); //25
		System.out.println();
		
		//정보올림피아드 알고리즘
		
		int[] b = new int [100]; // 2진 트리
		
		b[1] = 1;
		
		for(int i=2; i<100; i++){
			b[i] = b[i/2] + 1;
		}
		System.out.println(b[99]);
	}

}
