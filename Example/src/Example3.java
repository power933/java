import java.util.Arrays;

public class Example3 {

	public static void main(String[] args) {

		/*
		 * �迭 + �⺻ �޼ҵ� ���� product : ����, ���� ��� �� ���� Ű�� �ٳ��� ���� money : 35000 8000 4000
		 * 5500 3800 4400 11000 18900 ��ٱ��Ͽ� �ش� ��ǰ�� ��ҽ��ϴ� �� �� �� ����� �ٳ����� �����ϰ� �� �����ݾ���
		 * ����Ͻÿ�
		 */

		String arr[][] = { { "����", "����", "���", "��", "����", "Ű��", "�ٳ���", "����" },
				{ "35000", "8000", "4000", "5500", "3800", "4400", "11000", "18900" } };
		Example3 ex = new Example3();
		ex.list(arr);

	}

	public void list(String arr1[][]) {
		String arrlist[][] = new String[arr1.length][arr1[0].length];
		int sum = 0;
		int count = 0;
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr1[i].length; j++) {

				if (i == 0 && !(arr1[i][j].equals("���") || arr1[i][j].equals("�ٳ���"))) {
					arrlist[i][count] = arr1[i][j];
					arrlist[1][count] = arr1[1][j];
					sum += Integer.parseInt(arrlist[1][count]);
					count++;
				}

			}
		}

		System.out.println(Arrays.deepToString(arrlist));
		System.out.println(sum);
	}
}

//