package BIT02;

public class OOP74 {

	public static void main(String[] args) {
		//정보올림피아드 알고리즘
		//p.41 마. 조합적 반복으로 해결하기1
		
		int c = 0;
		int n = 9;
		
		for(int i=1; i<=n; i++){
			for(int j=i; j<=n; j++){
				int k = n-i-j;
				
				if(j<=k && i+j>k){
					c++;
				}
			}
		}
		System.out.println(c);
		
	}

}
