package BIT02;

public class OOP53 {

	public static void main(String[] args) {

		//  행  열
		int [][] a = new int[5][5];
		
		for(int i=0; i<a.length; i++){
			for(int j=0; j<a[i].length; j++){
				a[i][j] = 10;
				System.out.print(a[i][j] + "\t");
			}
		System.out.println();
		}
		
	}

}