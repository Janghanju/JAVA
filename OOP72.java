package BIT02;

public class OOP72 {

	public static void main(String[] args) {
		//정보올림피아드 알고리즘
		//p.40 다. 반복구조로 해결하기 회문 : 펠린드롭 좌우를 바꾸어 읽어도 같은 
		
		char[] s = {'m','a','d','a','m'}; // madam : 회
		int n = s.length; // n = 5(길이)
		int palin = 1;
		
		for(int i=0; i<n/2-1; i++){
			if(s[i] != s[n-i-1]){
				palin = 0;
				break;
			}
		}
		if(palin == 1){
			System.out.println("회문이다.");
		}else{
			System.out.println("회문이 아니다.");
		}
		
	}

}
