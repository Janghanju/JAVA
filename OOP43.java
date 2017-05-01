package BIT01;

public class OOP43 {
	public static void main(String[] args) {
		// 12~77=?
		int v=twoHap(12,77);
        System.out.println(v); //2937
	}
    // 매개변수로 정수 2개를 받아서 두수사이의 총합을 구하여 리턴하는 메서드를 정의?(twoHap)
	public static int twoHap(int s, int e){
		int sum=0;
		for(int i=s;i<=e;i++){
			sum+=i;
		}
		return sum;
	}	
}
