package BIT02;

public class OOP50 {

	public static void main(String[] args) {
		
		int[] a = {4,3,1,2,5};
		//Q)배열의 모든원소중 홀수의 총합을 구하여 출력하시오.
		
		int sum = 0;
		int sum1 = 0;
		
		for(int i=0; i<a.length; i++){
			if(a[i]%2 != 0){
				sum += a[i];	//홀
			}else{
				sum1 += a[i];	//짝
			}
		}
		System.out.println(sum);
		System.out.print(sum1);
	}

}
