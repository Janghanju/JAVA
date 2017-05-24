package BIT02;

public class OOP70 {

	public static void main(String[] args) {
		//정보올림피아드 알고리즘		정보 찾
		
		int[] a = {0,3,1,4,5,2};
		int[] b = new int[a.length];
		
		for(int i=1; i<a.length; i++){
			b[a[i]] = i;
		}
		System.out.println(b[2]);
		
	}

}
