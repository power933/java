import java.util.Scanner; 
// import : �ڹٿ� �ִ� ������ �ε��Ҷ� ����ϴ� ���
// export : �ڹٿ� �ִ� ������ ���ε� ������ �� �ִ� ���

//java.util ��Ű�� �ȿ� Scanner Ŭ���� �κ��� �ε� �ϰ� �˴ϴ�.
//java.util ��Ű���� �׳� ��� ���� ���ϸ� new�� �Ҵ��Ͽ� �����ڸ� ����ؾ���.
//��, �ش� �ڵ� ��ġ�� �ۼ��ڵ庸�� �Ʒ��� ������ �ȵ˴ϴ�.

public class If4 {

	public static void main(String[] args) {
		
		//new : ��ü�� �����ϴ� ���� ����.
		Scanner sc = new Scanner(System.in);
		//system.in != system.out
		System.out.println("id�� �Է��ϼ���");
		
		String mid = sc.nextLine();
		
		//next() : ����ڰ� �Է��ϴ� ���¸� ���մϴ�.(����, ���ڸ� �Է� �޴� ����)
		
		
		if(mid == "kim") {
			System.out.println("��ϵ� ȸ�� �Դϴ�.");
		}
		else {
			System.out.println("��ϵ��� ���� ȸ���Դϴ�.");
		}
		
		
		
		
	}

}
