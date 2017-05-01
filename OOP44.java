package BIT01;

public class OOP44 {
	public static void main(String[] args) {
		int[] a=new int[5];
		a[0]=10;
		a[1]=10;
		a[2]=10;
		a[3]=10;
		a[4]=10;
		int v=intHap(a);
		System.out.println(v); // 50
	}
	// 매개변수로 정수형배열을 받아서 배열의 모든원소를 더하여 리턴하는 메서드를 정의(intHap)
	public static int intHap(int[] a){
		int sum=0;
		for(int i=0;i<a.length;i++){
			sum+=a[i];
		}
		return sum;
	}
}
