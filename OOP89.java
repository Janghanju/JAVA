package BIT02;

public class OOP89 {

	public static void main(String[] args) {
		
		int[][] a = {{10,40},
					{20,50},
					{30,60}}; // 3행 2열에 모두 10을 넣어
		
		// 모든 원소의 총합
		int cnt = 0;
		
		for(int i=0; i<a.length; i++){
			for(int j=0; j<a[i].length; j++){
				cnt += a[i][j];
			}
		}
		System.out.println(cnt);
		
		int cnt_A = 0;
		
		int[][] b = {{10,40},
					{20,50},
					{30,60}};
		
		for(int i=0; i<b.length-1; i++){
			for(int j=0; j<=b[i].length; j++){
				cnt_A += b[j][i];
			}
			System.out.println("세로의 합 = " + cnt_A);
			cnt_A = 0;
		}
		System.out.println();
		
		int cnt_B = 0;
		
		for(int i=0; i<b.length; i++){
			for(int j=0; j<b[i].length; j++){
				cnt_B += b[i][j];
			}
			System.out.println("가로의 합 = " + cnt_B);
		}
		
	}

}
