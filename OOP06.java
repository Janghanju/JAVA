package BIT01;

public class OOP06 {

	public static void main(String[] args) {
		
		int up=1;
		up=up+1;
		up++;
		++up;
		up+=1;
		System.out.println(up);
		
		int cnt = 1;
		System.out.println(cnt++); //++는 적용안됨 다음 행에 적용 답 : 1
		System.out.println(++cnt); //++는 적용 답 : 2
		
		int down=5;
		down=down-1;
		down--;
		--down;
		down-=1;
		System.out.println(down);
		
		
		//특기자 문제
		int x=1;
		System.out.println(x++); // 1 --> 2
		System.out.println(++x); // 3
		System.out.println(x--); // 3 -->2
		System.out.println(x);	 // 2
	}

}
