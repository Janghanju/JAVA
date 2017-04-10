package BIT01;

public class OOP20 {
	public static void main(String[] args) {
		// 1~5까지의 숫자를 출력하라
		for(int i=1; i<=5; i++){
			System.out.println(i);
		}
		// A부터 Z까지의 알파벳을 출력하
		for(char i='A';i<='Z';i++){
			System.out.println(i);
		}
		// 0~100까지의 짝
		for(int i=0;i<=100;i++){
			if(i%2==0){
				System.out.println(i);
				}
		}
		
		
	}
/*
 * 반보군(LOOP)
 * for(초기값; 최종값; 증가/감소){ 반복횟수를 예측할수 있어야 한다.
 * 반복할 문
 * }
 * 
 * for(int i=0; i<=10; i++;){
 * 	System.out.print();
 * }
 */
}
