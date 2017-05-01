public class OOP39 {
	public static void main(String[] args) {
       char[] a={'w','h','i','t','e'}; // ehitw
       char tmp;   // 5-1=>4
	   for(int i=0;i<a.length-1;i++){
		for(int j=i+1;j<a.length;j++){
			if(a[i] > a[j]){
				tmp=a[i];
				a[i]=a[j];
				a[j]=tmp;
			}
		 }
	   } 	
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+"\t");
		}
		System.out.println();

		char sd='f'; // e라는 문자가 몇 번째인는가?(이진검색): 0
		int low=0;
		int high=a.length-1;
		int middle;
		int index=-1; // 실패전제?
		//----------------------------------
		int cnt=0;
		while(low<=high){
		  middle=(low+high)/2;
		  if(sd==a[middle]){
			  index=middle;//6
			  break;
		  }else if(sd>a[middle]){
			  low=middle+1;
		  }else{
			  high=middle-1;
		  }				  
		}
		// 출력
		if(index!=-1){
			System.out.println(sd+" is index at "+ index);
		}else{
			System.out.println("실패");
		}
	}

}
