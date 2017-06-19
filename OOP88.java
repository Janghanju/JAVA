package BIT02;

public class OOP88 {

	public static void main(String[] args) {
		
		// 2차원 배열
		int[][] a = new int[3][2];
		
		for(int i=0; i<a.length; i++){
			for(int j=0; j<a[i].length; j++){ // a[i].length는 배열의 길이가 달랐을 경
				a[i][j] = 10;
				//System.out.print(a[i][j] + "\t");
			}
			System.out.println();
		}
		
		// 2차원 배열
		int[][] b = new int[5][];
		b[0] = new int[1];
		b[1] = new int[2];
		b[2] = new int[3];
		b[3] = new int[4];
		b[4] = new int[5];
		
		for(int i=0; i<b.length; i++){
			for(int j=0; j<b[i].length; j++){
				b[i][j] = '*';
				System.out.print((char)b[i][j]);
			}
			System.out.println();
		}
		
	}
}