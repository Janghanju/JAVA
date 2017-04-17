package BIT01;

public class OOP36 {

	public static void main(String[] args) {
		
		// 검색(serch), 순차검색 => 이검색(Binary Search) : 중앙에서부터 검색 하지만 데이터값이 오른차순정리 되어있어야 
		
		int[] a = {10,20,30,40,50,60,70,80,90,100};
		int sd = 70;
		int index = -1; //-1은 검색실패의 의
		
		for(int i=0;i<a.length;i++){
			if(sd == a[i]){
				index = i; //성공
				break;
			}
		}
		
			if(index == -1){
				System.out.println("실패");
			}else{
				System.out.println(sd + " is index " + index);
			}
			// 순차검색 단점은 데이터의 위치에 따라서 검색 성능이 좌지우지된다.
			// 소량의 데이터인 경우에 적합
			// 비교횟수 : 7
	}

}
