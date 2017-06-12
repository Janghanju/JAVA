package BIT02;

public class OOP79 {

	public static void main(String[] args) {
		
		char[] c={'1', '2', '3', '4', '5'};
		int cnt = 0;
			
			for(int i=0; i<c.length; i++){
				cnt += (int)c[i] - '0';
			}
			System.out.println(cnt);
	}

}
