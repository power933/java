import java.util.Scanner;

public class Scan7 {

	public static void main(String[] args) {
		
		int sc = 220524;
		System.out.println("�������� ��ȣ�� �Է��ϼ���");
		Scanner pw = new Scanner(System.in);
		int pw1 = pw.nextInt();
		if(pw1 == sc) {
			System.out.println("���� Ȯ�� �Ǽ̽��ϴ�");
		}
		else {
			System.out.println("������ȣ�� Ʋ���ϴ�.");
		}
		pw.close();
	}

}


/*
 * �������� ��ȣ�� �Է��ϼ���
 * ���� 220524
 * 
 * ����ڰ� ���� 220524 �ܿ� �Է½� 
 * "������ȣ�� Ʋ���ϴ�" ��� ����ϰ�
 * ������ ������ȣ ���ڸ� �Է½�
 * "����Ȯ�� �Ǽ̽��ϴ�" ��� ���.
 * 
 * ��,220524�� java����� ���� ���� ����Ǵ� �����μ� ó���ϼ���
 * */

