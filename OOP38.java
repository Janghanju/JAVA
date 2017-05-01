package BIT01;

public class OOP38 {

	public static void main(String[] args) {
		
		// 정렬(Softing) : 데이터를 순서를 정해서 출력
		// 1,2,3 --> 오름차순, 3,2,1 --> 내림차순
		
		// 데이터 베이스
		int[] a = {4,3,1,2,5};
		int temp;
		
		// 선택정렬 알고리즘 (올림차순)
		for(int i=0; i<a.length-1; i++){
			for(int j=i+1; j<a.length; j++){
				if(a[i] > a[j]){
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		
		// 출력
		for(int i=0; i<a.length; i++){
			System.out.print(a[i] + "\t");
		}
		
	}

}
