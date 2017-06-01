package BIT02;

public class OOP75 {

	public static void main(String[] args) {
		//정보올림피아드 알고리즘
		//p.43 바. 조합적 반복으로 해결하기2(반대 선택하기)
		
		int[] a = {7,5,5,4,9};
		int s = 0;
		
		for(int i=0; i<a.length; i++){
			s += a[i];
		}
		
		int m = 0;
		
		for(int i=0; i<a.length-1; i++){ // i = 첫번째 카드 선택
			for(int j=i+1; j<a.length; j++){ // j = 두번째 카드
				int p = (s-a[i] - a[j])%10;
				
				if(p>m){
					m = p;
				}
			}
		}
		
		System.out.println(m);
		
	}

}
