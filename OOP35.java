package BIT01;

public class OOP35 {

	public static void main(String[] args) {
		
		// 최대값과 최솟값을 구하시오
		
		int[] a={4,3,1,2,5};
		int Max = Integer.MIN_VALUE;
		int Min = Integer.MAX_VALUE;
		
		for(int i=0;i<a.length;i++){
			if(a[i] > Max) Max = a[i];
			if(a[i] < Min) Min = a[i];
		} System.out.println(Max);
		  System.out.println(Min);
		
	}

}
