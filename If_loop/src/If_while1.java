
public class If_while1 {

	public static void main(String[] args) {

		// while������ 10���� 30���� ������ Ȧ������ ���

		int a = 10;
		while (a < 31) {
			if (a % 2 == 1 && a > 19) {
				// System.out.print(a + " ");
			}
			a++;
		}

		// 1~10���� ¦������ ���
		int ww = 1;
		int count = 0; //ī���� ������

		while (ww < 11) {
			if (ww % 2 == 0) { //¦���� ���
				count++;		//�ش� ������ ���� ��� +1��
			}
			ww++;
		}
		//�ݺ��� ����� ���� ����� ����� ī���Ͱ��� �����ϰ� �˴ϴ�
		System.out.println(count);

	}

}
