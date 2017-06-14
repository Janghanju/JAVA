package BIT02;

public class OOP86 {

	public static void main(String[] args) {
		//이중 for문 - 구구단
		/*		
		int su = 1;
		
		for(int i=0; i<3; i++){
			for(int j=0; j<3; j++){
				System.out.print((su++) + "\t");
			}
			System.out.println();
		}
		*/
		
		for(int i=1; i<10; i++){
			for(int j=2; j<10; j++){
				System.out.print(j + " X " + i + " = " + j*i + "\t");
			}
			System.out.println();
		}
		
	}

}
