public class If_for2 {

	public static void main(String[] args) {

		// 1~100���� ���� �� 80�̻��� ���ڸ� ���
		int f;
		String ff = "";
		int fff[] = new int[21];
		for (f = 1; f < 101; f++) {
			if (f > 79) {

			}
		}
		// 200~300���� ������ 240 ������ ���ڸ� ���

		int a;
		for (a = 200; a < 301; a++) {
			if (a < 241) {
				// System.out.print(a + " ");
			}
		}
		final int b = 2;
		int w;
		for (w = 1; w < 11; w++) {
			if (w % a == 0) {
				System.out.print(w + " ");
			}
		}
		// �������� 2���� �ݺ��մϴ� ��, 2�� ������� 10 �̻� ���ڸ� ��µ˴ϴ�

		int x;
		int total;
		for (x = 1; x < 10; x++) {
			total = 2 * x;
			if (total > 10) {
				// System.out.println(total);
			}
		}
		// 18 36 54 72 2 4 6 8
		int gugu;
		for (int i = 1; i < 10; i++) {
			if (i % 2 == 0) {
				//System.out.println(i * 9);
			}
		}
		
		//1~20������ ���� �Դϴ� 6 14 17 19 -8 - 3 -2
		
		for(int j = 1; j<21;j++) {
			if(j==6||j==14||j==17||j==19) {
				System.out.println(j);
			}
		}
	}

}
