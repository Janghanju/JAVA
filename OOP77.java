package BIT02;

public class OOP77 {

	public static void main(String[] args) {
		
		int[] a = {4,3,1,2,5};
		int cnt = 0;
		// 짝수의합 =?
		
		for(int i=0; i<a.length; i++){
			if(a[i]%2 == 0){
				cnt += a[i];
			}
		}
		System.out.println(cnt);
	}

}
