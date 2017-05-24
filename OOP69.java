package BIT02;

public class OOP69 {

	public static void main(String[] args) {
		//정보올림피아드 알고리즘 삽입정
		
		int[] a = {10,7,20,5,30,4};
		int cnt = 0;
		
		for(int i=1; i<a.length; i++){
			for(int j=i; j>=1; j--){
				if(a[j] > a[j-1]){
					break;
				}else{
					int t = a[j];
					a[j] = a[j-1];
					a[j-1] = t;
					cnt++;
				}
			}
		}
		for(int i=0; i<a.length; i++){
			System.out.print(a[i] + "\t");
		}
		System.out.println();
		System.out.println(cnt +"번");
	}

}
