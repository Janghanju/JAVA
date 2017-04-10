package BIT01;

public class OOP21 {

	public static void main(String[] args) {
		// 10->9->8->7->6....0
		for(int i=10;i>=0;i--){
			System.out.println(i);
		}
		// 1~5까지의 숫자를 출력하라
		int x=1;
		while(x<=5){
			System.out.println(x);
			x++;
		}
		// 1~10까지의 수중홀수만 출력하라
		int s=1;
		while(s<10){
			if(s%2!=0){
				System.out.println(s);
			}
			s++;
		}
	}
/*
 * 반복문(while) : 반복횟수를 예측할수없는 경우 사용한다.
 * 
 * 초기화
 * while(조건){
 * 처리문장증감식;
 * }
 */
// -------------------------------------------
/* 제어문 : 프로그램의 흐름을 변경
 * break;
 * continue;
 * 
 * [배열/함수(메드)]
 */

}
