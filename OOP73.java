package BIT02;

public class OOP73 {

	public static void main(String[] args) {
		//정보올림피아드 알고리즘
		//p.41 라. 재귀함수로 해결하기
		
		char[] s = {'r','a','d','a','r'};
		int cnt = f(s,0,4);
		if(cnt == 1){
			System.out.println("회문이다.");
		}else{
			System.out.println("회문이 아니다.");
		}
		
	}
	public static int f(char[] s, int start, int end){
		
		if(end <= start){
			return 1;
		}else if(s[start] != s[end]){
			return 0;
		}else{
			return f(s, start +1, end-1); //재귀함수
		}
	}
}
