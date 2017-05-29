package BIT02;

public class OOP71 {

	public static void main(String[] args) {
		//정보올림피아드 알고리즘
		//p.39 나. 핵심 식 만들기
		
		//오름차순 정렬됨, 중복 숫자가 있다.
		int[] a = {3,5,5,6,8,10,11,12,13,13};
		int p = 1;
		
		for(int i=1; i<a.length; i++){
			if(a[i] > a[i-1]){
				p++;
			}
		}
		System.out.println(p);
		
	}

}
