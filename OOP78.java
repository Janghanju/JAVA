package BIT02;

public class OOP78 {

	public static void main(String[] args) {
		
		char[] c = {'a', 'p', 'p', 'l', 'e'};
		//apple --> APPLE
		//-32
		
		for(int i=0; i<c.length; i++){
			int a = c[i] - 32;
			System.out.print((char)a);
		}
	}

}
