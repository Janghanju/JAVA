package BIT02;

public class OOP54 {

	public static void main(String[] args) {
						//  행  열
		int [][] a = new int[5][5];
		
		for(int i=0; i<a.length; i++){
			for(int j=0; j<a[i].length; j++){
				a[i][j] = '*'; //42
				System.out.print((char)a[i][j]);
			}
		System.out.println();
		}

	}

}