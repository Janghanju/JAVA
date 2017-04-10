package BIT01;

public class OOP24 {

	public static void main(String[] args) {
		//1~10까지의 수중 3의배수만 출력하시오.
		
		for(int i=1;i<=10;i++){
			if(i%3==0){
				System.out.println(i);
				}
			}
		
		//1~50까지의 수중 3의 배수이고 5의 배수인 수를 출력하시오.
		
		for(int i=1;i<=51;i++){
			if(i%3==0 && i%5==0){
				System.out.println(i);
				}
			}
		
	}
}