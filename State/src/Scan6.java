import java.util.Scanner;

public class Scan6 {

	public static void main(String[] args) {
		
		Scanner id = new Scanner(System.in);
		System.out.println("������ ���̵� �Է��ϼ���");
		String m = id.next();
		
		Scanner pass = new Scanner(System.in);
		System.out.println("�н����带 �Է��ϼ���.");
		String p = pass.next();
		
		if(m.equals("jung") || m.equals("su")) {
			if(m.equals("jung") && p.equals("j1234")) {
				System.out.println("�α��� ȯ��");
			}
			else if(m.equals("su") && p.equals("ssh")) {
				System.out.println("�α��� ȯ��");
			}
			else {
				System.out.println("��й�ȣ�� Ȯ�� �ϼ���");
			}
		}
		else {
			System.out.println("�α��ν���");
		}

	}

}


/*
 * ȸ������ ���̵� jung,su
 * �н����� jung - j1234
 *        su : ssh
 * �ش� ���̵� �ܿ��� ���Ե��� ���� ����� �Դϴ�
 * ���� �н����尡 Ʋ����� ȸ�������� �ٽ� Ȯ�� �ϼ���.
 * ���̵� �� �н����尡 ��� ���� ��� �α��� �Ǽ̽��ϴ� ��� ���

*/