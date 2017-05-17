package BIT02;

public class OOP61 {

	public static void main(String[] args) {
		//정보올림피아드 알고리즘
		
		int i,t;
		i = t = 0;
		
		while(i<30){
			i++;
			if(i%2==0) t+=i;
			else t -= i;
		}
		System.out.println(t); //15(2x16(n)-1=30) -> -n
		System.out.println(i);
		System.out.println();
		
		//정보올림피아드 알고리즘
		
		int a = 12;
		int b = 18;
		int c;
		
		while(b>0){ //유클리트 호제
			c = a%b;
			a = b;
			b = c;
		}
		System.out.println(a); //6
	}

}
