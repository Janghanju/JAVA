package BIT02;

public class OOP93 {

	public static void main(String[] args) {
		float[] f = makeArr(5);
		for(float g : f){
			System.out.println(g);
		}
	}
	// 매개변수로 정수 1개를 받아서 정수의 개수큼 실수형 배열을 만들고
	// 만들어진 배열에 실수 5개를 지정하고 만들어진 배열을리턴하는 매서드를 정의(makeArr)
	
	public static float[] makeArr(int a){
		float[] f = new float[a];
			for(int i=0; i<f.length; i++){
				f[i] += 10.502*i;
			}
		
		return f;
	}
	
	
	
}
