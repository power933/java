import java.lang.reflect.Array;
import java.util.Arrays;

public class Array2 {

	public static void main(String[] args) {

		String[] id = { "hong", "kim", "park", "lee", "jang", "jung" };
		/*
		 * �ش� ����� �迭�� �ֽ��ϴ� �ش� �迭���� ����� id 3�ܾ� �̻� ��½�Ű�ÿ�
		 */

		for (int i = 0; i < id.length; i++) {
			if (id[i].length() > 3) {
//				System.out.println(id[i]);
			}
		}
//		15 60 10 14 27
//		���� ������ ���� ��� ���ؼ� ���� ������� ���

		int[] num = { 15, 60, 11, 14, 27 };
		int total = 0;
		for (int j = 0; j < num.length; j++) {
			total += num[j];
		}
		System.out.println(total);

	}
}
