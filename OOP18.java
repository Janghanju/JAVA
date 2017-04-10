package BIT01;
public class OOP18 {
	public static void main(String[] args) {
		// if
		int a=15;
		//a가 3의 배수인지 판별하라
		if(a%3==0){
			System.out.println("3의 배수이다.");
		}else{
			System.out.println("3의 배수가 아니다.");
		}
		
		char c='a'; //c가 대문자인지 소문자인지 알파벳이 아닌지 판별하라.
		if(c>='A' && c<='Z'){
			System.out.println("대문자이다.");
		}else if(c>='a' && c<='z'){
			System.out.println("소문자이다.");
		}else{
			System.out.println("알파벳이 아니다.");
		}
		
		// 시험점수가 0~100까지 차등 등급을 자동으로 연산하라
		  // jum : 90~100 - A
		  // jum : 80~89 -  B
		  // jum : 70~79 -  C
		  // jum : 0~69¡°¿Ã«œ - D«–¡°
		int jum=90;		
		if(jum>=0 && jum<=100){
			if(jum>=90){
				System.out.println("A");
			}else if(jum>=80){
				System.out.println("B");
			}else if(jum>=70){
				System.out.println("C");
			}else{
			    System.out.println("D");
			}
			System.out.println("=======");
		}else{
			System.out.println("오류가 있습니다. 확인해주세요");
		}		
	}
}
