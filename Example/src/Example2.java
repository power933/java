import java.util.Arrays;

public class Example2 {

	public static void main(String[] args) {
		/*
		 * �迭 + �⺻ �޼ҵ� ���� product : ���� ���� ��� �� ���� Ű�� �ٳ��� ���� �� ���� �� Ű���� �����Ͽ����ϴ� �ش� ���� ��
		 * �迭�� �ٽ� �縮��Ʈ �ϴ� �ڵ带 �ۼ��Ͻÿ� �� �ش� ó�������� ��� ������ �޼ҵ忡�� ó���� �Ǿ�� �ϸ� �ݺ����� �������
		 */

		String arr[] = { "����", "����", "���", "��", "����", "Ű��", "�ٳ���", "����" };
		Example2 ex = new Example2();
		ex.list(arr);
	}

	public void list(String[] list) {
		int count = 0;
		String[] tmp = new String[list.length];
		for (int i = 0; i < list.length; i++) {
			if (!(list[i].equals("����") || list[i].equals("Ű��") || list[i].equals("��"))) {
				tmp[count] = list[i];
				count++;
			}
		}
		String result[] = new String[count];
		for (int j = 0; j < result.length; j++) {
			result[j] = tmp[j];
		}

		System.out.println(Arrays.toString(result));
	}

}
