package BIT02;

public class OOP59 {

	public static void main(String[] args) {
		//정보올림피아드 알고리즘
		
		int y = 2016;
		int v = f(y);
		
		if(v == 0){
			System.out.println("평년");
		}else{
			System.out.println("윤년");
		}
	}	
	private static int f(int y){
		if((y%4 != 0 && y%100 == 0) || (y%400 !=0)) return 0;
		else return 1;
	}
	
	}
