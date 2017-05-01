package BIT01;

public class OOP37 {

	public static void main(String[] args) {
		
		//데이터 베이스
		int[] a = {10,20,30,40,50,60,70,80,90,100};
		int w_date = 700;
		
		//필요 데이
		int low = 0;
		int high = a.length - 1;
		int middle;
		int index = -1;
		
		int cnt = 0;
		
		// 2진검색 알고리즘
		while(low <= high){
			middle = (low + high) / 2;
			if(w_date == a[middle]){
				index = middle;
				break;
			}else if(w_date > a[middle]){
				low = middle + 1;
			}else{
				high = middle - 1;
			}
			cnt ++;
		}
		
		
		// 출력
		if(index != -1){
			System.out.println(w_date + " is index at " + index);
			System.out.println("비교횟수" + cnt);
			
		}else{
			System.out.println("실패");
			System.out.println("비교횟수" + cnt);
		}
		//
		
	}

}
