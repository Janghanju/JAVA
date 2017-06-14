package BIT02;

public class OOP87 {

	public static void main(String[] args) {
		
		// 1,2,3,4,5 : 오름차순 정렬
		
		int[] a = {4,3,1,2,5};
		
		for(int i=0; i<a.length; i++){
			for(int j=i+1; j<a.length; j++){
				if(a[i] > a[j]){ //내림차순의 a[i] < a[j]
					int tmp = a[i];
					a[i] = a[j];
					a[j] = tmp;
				}
			}
		}
		for(int date : a){
			System.out.print(date + "\t");
		}
		
	}

}
