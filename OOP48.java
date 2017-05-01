package BIT01;

public class OOP48 {

	public static void main(String[] args) {
		
		//정렬되지않은 10개의 수가 있다.
		int[] arr = {108,31,76,43,56,90,12,69,25,88};
		int sd = 69;
		//Q) 69는 몇번째 위치에 존재하는지 검색하여 출력하시오. (단, 이진검색을 사용한다.)
		// --> 이진검색의 전재조건 데이터가 오름차순일 때만 사용가능
		
		for(int i=0; i<arr.length-1; i++){
			for(int j=i+1; j<arr.length; j++){
				if(arr[i] > arr[j]){
					int tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		} // for_i
		
		int low = 0;
		int high = arr.length-1;
		int middle;
		int index = -1;
		while(low <= high){
			middle = (low + high)/2;
			if(sd == arr[middle]){
				index = middle;
				break;
			}else if(sd > arr[middle]){
				low = middle +1;
			}else{
				high = middle -1;
			}
		}//
		if(index != -1){
			System.out.println(sd + "는 " + index + " 위치에 존재합니다.");
		}else{
			System.out.println("검색실패");
		}
	}

}
