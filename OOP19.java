package BIT01;

public class OOP19 {

	public static void main(String[] args) {
	      
			int a=10;
	      
			switch (a%2) {
				case 0:
					System.out.println("짝수");
					break;	
				case 1:
					System.out.println("홀수");				
			}
		   
			int jum=88;
			  // jum : 90~100 - A
			  // jum : 80~89 -  B
			  // jum : 70~79 -  C
			  // jum : 0~69이하는 E
		if(jum>=0 && jum<=100){	
		    switch (jum/10) {
				case 10:
				case 9:
					System.out.println("A");
					break;
				case 8:
					System.out.println("B");
					break;
				case 7:
					System.out.println("C");
					break;
				default:
					System.out.println("D");
					break; //종료하고 넘어간다.
				}
		 }else{
			 System.out.println("E");		 
		 }	 
		}
	}
	/*
	  ºswitch/case
	  switch(조건){
	  
	   case 조건 연산값1:
	   
	   break;
	   case 조건 연산값2:
	  
	   break;
	   case 조건 연산값3:
	   
	   break;
	   default:
	   
	  }
	*/