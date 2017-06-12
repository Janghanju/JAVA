package BIT02;

public class OOP82 {

	public static void main(String[] args) {
		
		int[] a = {4,3,1,2,5};
		
		for(int i=0; i<a.length; i++){
			System.out.print(a[i] + ":");
			
			for(int j=0; j<a[i]; j++){
				System.out.print("*");
			}
			
			System.out.println();
		}
		
	}

}
