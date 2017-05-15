package BIT02;

public class OOP60 {

	public static void main(String[] args) {
		//정보올림피아드 알고리즘
		
		int k = 10;
		int c = 0;
		do{
			if(k%2 == 0) k/=2;
			else k = 3 * k + 1;
			c++;
		}while(k>1);
		System.out.println(c);
		
		//정보올림피아드 알고리즘
		
		c=0; //위에 인한 초기화
		for(int i=1; i<=30; i++){
			if(i%3 == 0 && i%5 == 0){
				c++;
			}
		}
		System.out.println(c);
	}

}
