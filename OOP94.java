package BIT02;

public class OOP94 {

	public static void main(String[] args) {	
		for(int i=1; i<101; i++){
			if(i%3 == 0){
				System.out.print(i + "\t");
			}
		}System.out.println();

System.out.println("---------------------------------------");

		for(int i=1; i<50; i++){
			if(i == 3 || i == 6 || i == 9 || i-10 == 3 || i-10 == 6 || i-10 == 9 || i-20 == 3 || i-20 == 6 || i-20 == 9 || i-30 == 3 || i-30 == 6 || i-30 == 9 || i-40 == 3 || i-40 == 6 || i-40 == 9 || i-50 == 3 || i-50 == 6 || i-50 == 9){
				System.out.print("박수" + "\t");
			}else if (i == 5 || i-10 == 5 || i-20 == 5 || i-30 == 5 || i-40 == 5 || i-50 == 5){
				System.out.print("으악" + "\t");
			}else{
				System.out.print(i + "\t");
			}
		}System.out.println();
		
System.out.println("---------------------------------------");
		
		int[] array = {3,2,5,4,4,1,5,5,4,1,2,4,5,5,1};
		
		int[] cnt = new int[5];
				
		for(int i=0; i<array.length; i++){
			cnt[array[i]-1]++;	
		}
		
		for(int i=0; i<cnt.length; i++){
			System.out.print(i+1 + " : ");
			for(int j=0; j<cnt[i]; j++){
				System.out.print("*");
			}System.out.println();
		}
System.out.println("---------------------------------------");
	
		int[] list = {1,2,3,4,5,4,3,2,1};
		
		for(int i=0; i<list.length; i++){
			for(int j=0; j<list[i]; j++){
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}
