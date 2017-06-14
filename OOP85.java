package BIT02;

public class OOP85 {

	public static void main(String[] args) {
		
		int[] a = {4,3,1,2,5};
		int[] b = new int[a.length];
		//	  b = {5,2,1,3,4}로 만들어
		
		int index = 4;
		for(int date : a){
			b[index--] = date;
		}
		for(int date : b){
			System.out.print(date + " ");
		}
		
	}

}
