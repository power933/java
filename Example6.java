import java.util.Scanner;

public class Example6 {

	public static void main(String[] args) {
		
		/*
		 	��ǰ������ 42000�� �Դϴ�.
		 	����ڰ� �ش� ��ǰ�� ������ �Է����� �˴ϴ�
		 	�ش� ��ǰ ���ݿ� �´� ���� ��ŭ ���Ͽ� ���� ���� �ݾ���
		 	��½�Ű�� extends�� �����Ͻø� �˴ϴ�
		 	�� , 42000�� ���� ���ڰ� �ٲ�� �ȵ˴ϴ�.
		 	����ڰ� �ִ� ������ �� �ִ� ������ 5�� �Դϴ�.
		 	������� ���� main.�޼ҵ忡�� ���
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("���� ���� �Է�");
		int a1 = sc.nextInt();
		
		res r = new res();
		r.resu(a1);
		System.out.println(r.res1());
	}

}

class list{
	private int goods = 42000;
	protected int sum = 0;
	int x = 0;
	public void resu(int a) {
		this.x = a;
		 sum = a*this.goods;
	}
}
class res extends list{
	public String res1() {
		String msg = "";
		if(this.x>5) {
			msg = "5�������� ���� �����մϴ�";
		}
		else {
			msg = String.valueOf(sum);
		}
		return msg;
	}
	
	
}