import java.util.Scanner;

public class Scan2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("ID�� �Է��ϼ���");
		String mid = sc.next();
		
		if(mid.equals("kim")) { 
			//���ڿ� ���´� scanner�̿�� equals��� �Լ��� ����մϴ�.
			System.out.println("ȸ���� Ȯ�� �Ǿ����ϴ�.");
		}
		else {
			System.out.println("ȸ���� Ȯ�ε��� �ʾҽ��ϴ�.");
		}

	}

}
