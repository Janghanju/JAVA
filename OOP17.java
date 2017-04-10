package BIT01;

public class OOP17 {

	public static void main(String[] args) {
		// 조건문-판단(if), 참일떄 ?, 거짓 ?
		int a=5;
		
		// 블럭 if문
		if(a%2!=0) {
			System.out.println("짝수");
		} else {
			System.out.println("홀수");
		}
		
		int jum = 70;
		// 다중 if문, 중첩 if문
		if(jum>=0 && jum<=100) {
			
			if(jum>=90) {
				System.out.println("A학점입니다.");
			} else if(jum>=80) {
				System.out.println("B학점입니다.");
			} else if(jum>=70) {
				System.out.println("C학점입니다.");
			} else {
				System.out.println("D학점입니다.");
			}
			
		} else {
			System.out.println("점수를 확인해주세요");
		}
	}

}
