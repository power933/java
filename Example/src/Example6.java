import java.util.Arrays;
import java.util.Scanner;

public class Example6 {

	public static void main(String[] args) {

		/*
		 * 2���迭�̸�, 2���迭 �����ʹ� ������ �����ϴ�. userlist : ȫ�浿 �̼��� ������ ������ ������� ������ �Թ��屺
		 * user_point : 3000 1000 25000 19800 5750 3630 0
		 * 
		 * ���α׷� ���۰� ���ÿ� "����Ʈ�� �˻��� ������ �Է��ϼ���" �Է��� ���� ������ class�� �����Ͽ� �ش� �޼ҵ� ������ �Ű�������
		 * �̿��Ͽ� ���� �� �ش� ������� ����Ͻÿ�
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("����Ʈ�� �˻��� ������ �Է��ϼ���");
		String user = sc.next();

		ulist u = new ulist();
		u.serch(user);

	}

}

class ulist {

	String user[][] = { { "ȫ�浿", "�̼���", "������", "������", "�������", "������", "����屺" },
			{ "3000", "1000", "25000", "19800", "5750", "3630", "0" } };
	String x = "";

	public void serch(String str) {
		for (int i = 0; i < user.length; i++) {
			for (int j = 0; j < user[i].length; j++) {
				if (user[i][j].equals(str)) {
					x = user[1][j];
				}
			}
		}
		System.out.println(x);
	}
}
