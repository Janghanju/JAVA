package BIT02;

public class OOP83 {

	public static void main(String[] args) {
		
		int[] a = {4,3,1,2,5};
		// 홀수가 몇개인가?
		
		int cnt = 0;
		int cnt_1 = 0;
		for(int i=0; i<a.length; i++){
			if(a[i]%2 != 0){
				cnt ++;
			}
		}
		
		//or
		
		for(int su : a){ // foreach문~(향된 for문)
			if(su%2 !=0){
				cnt_1 ++;
			}
		}
		
		System.out.println(cnt);
		System.out.println(cnt_1);
	}

}
