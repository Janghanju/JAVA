package BIT02;

public class OOP68 {

	public static void main(String[] args) {
		//정보올림피아드 알고리즘		재귀함수
		
		int[] a = {2,14,20,8,17,13};
		
		for(int i=0; i<a.length-1; i++){
			for(int j=i+1; j<a.length; j++){
				if(a[i] < a[j]){
					int t = a[j];
					a[j] = a[i];
					a[i] = t;
				}
			}
		}
		for(int i=0; i<a.length; i++){
			System.out.println(a[i]+"\t");
		}
	}

}
