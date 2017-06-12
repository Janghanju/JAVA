package BIT02;

public class OOP76 {
	
		//정보올림피아드 알고리즘
		//p.45 가. 재귀함수로 분기하기
	
		int m = 4;
		int n = 5;
		
		int[][] h = {
				{50,40,37,32,39},
				{35,50,40,20,25},
				{30,30,25,17,28},
				{27,24,22,15,10}
				};

		int[][] s = new int[m][n]; // 4X5
		
	//함수선언 f(y,x)
	public int f(int y, int x){
		if(s[y][x]>0){
			return s[y][x];
		}else{
			
			int t=0;
			
			if(y>=2 && h[y-1][x] < h[y][x])	t += f(y-1, x);
			if(y<=m-1 && h[y+1][x] < h[y][x])	t += f(y+1, x);
			if(x>=2 && h[y][x-1] < h[y][x])	t += f(y, x-1);
			if(x>=n && h[y][x+1] < h[y][x])	t += f(y, x+1);
			
			s[y][x] = t;
			
			return t;
			
		}
	}
	//
	
	//함수선언 init
	public void init(){
		for(int i=0; i<s.length; i++){
			for(int j=0; j<s[i].length; j++){
				s[i][j]=0;
			}
		}
		
		s[m][n] = h[m][n];
		
		System.out.println(f(1,1));
	}	
	//
	
	//메인
	public static void main(String[] args) {
		new OOP76().init();
	}
	//
}