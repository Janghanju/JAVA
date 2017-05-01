package BIT01;

public class OOP48 {

	public static void main(String[] args) {
		
		//���ĵ������� 10���� ���� �ִ�.
		int[] arr = {108,31,76,43,56,90,12,69,25,88};
		int sd = 69;
		//Q) 69�� ���° ��ġ�� �����ϴ��� �˻��Ͽ� ����Ͻÿ�. (��, �����˻��� ����Ѵ�.)
		// --> �����˻��� �������� �����Ͱ� ���������� ���� ��밡��
		
		for(int i=0; i<arr.length-1; i++){
			for(int j=i+1; j<arr.length; j++){
				if(arr[i] > arr[j]){
					int tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		} // for_i
		
		int low = 0;
		int high = arr.length-1;
		int middle;
		int index = -1;
		while(low <= high){
			middle = (low + high)/2;
			if(sd == arr[middle]){
				index = middle;
				break;
			}else if(sd > arr[middle]){
				low = middle +1;
			}else{
				high = middle -1;
			}
		}//
		if(index != -1){
			System.out.println(sd + "�� " + index + " ��ġ�� �����մϴ�.");
		}else{
			System.out.println("�˻�����");
		}
	}

}
