package BIT02;

public class OOP57 {

	public static void main(String[] args) {
		//정보올림피아드 알고리즘
		
		int c = 0;
		
		for(int i=1; i<=100; i+=7){
			c++;
		System.out.print(c + "\t");
		}
		System.out.println();
		
		//정보올림피아드 알고리즘
		
		int k=0;
		
		for(int i=1; i<=3; i++){
			for(int j=1; j<=i; j++){
				k += i + j;
			}
		}
		System.out.println(k);
		
	}

}
