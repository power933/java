
public class If3 {

	public static void main(String[] args) {
		
		//boolean �� true , false �� �����ϰ� �˴ϴ�.
		boolean ck=true;
		if(ck==true) {
			System.out.println("ȸ�������� ���� �˴ϴ�.");
		}
		else {
			System.out.println("�̿����� �����ϼž� �մϴ�.");
		}
		
		String mid = "kim", mpass="a1234";

		//&& : �Ѱ��� ���� �̻� ��� �������
		//|| : �Ѱ��� ���� �̻󿡼� �Ѱ��� ���� ���.
		if(mid=="park" && mpass=="a1234") {
			System.out.println("�α��ο� �����ϼ̽��ϴ�.");
		}
		else {
			System.out.println("���̵�� �н����带 Ȯ�����ּ���.");
		}
		
		if(mid=="park" || mid=="kim") {
			System.out.println("ȸ���� Ȯ�� �Ǿ����ϴ�.");
			
		}
		else
			System.out.println("Ȯ�ε� id�� �����ϴ�");
		
	}

}
