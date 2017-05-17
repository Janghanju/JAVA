package BIT02;

public class OOP63 {

	public static void main(String[] args) {
		
		int[] a = new int [7];
		
		a[1] = 2;
		a[2] = 3;
		a[3] = 4;
		a[4] = 5;
		a[5] = 1;
		
		for(int i=1; i<=5; i++){
			a[i] = a[a[i]];
		}
		System.out.println(a[5]);
		
	}

}
