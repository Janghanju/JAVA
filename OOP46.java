package BIT01;

public class OOP46 {
	public static void main(String[] args) {

		// �󵵼� ���ϱ�(���� : 1~5)
		int[] a = { 5, 1, 4, 1, 2, 5, 3, 4, 5, 2 };
		int[] c = new int[5];

		for (int i = 0; i < a.length; i++) {
			c[a[i] - 1]++;
		}

		for (int i = 0; i < c.length; i++) {
			System.out.println((i + 1) + "�� ����: " + c[i]);

			for (int j = 0; j < c[i]; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}
}
/*
 * 
 * 1�� ���� : 2 2�� ���� : 2 3�� ���� : 1 4�� ���� : 2 5�� ���� : 3
 * 
 */