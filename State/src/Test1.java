import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("ù��° ���ڰ��� �Է��ϼ���");
		int x = sc.nextInt();
		
		Scanner sc1 = new Scanner(System.in);
		System.out.println("�ι�° ���ڰ��� �Է��ϼ���");
		int y = sc1.nextInt();
		
		int z = x*y;
		
		if(z <= 100) {
			System.out.println("100������ ����Դϴ�");
		}
		else {
			System.out.println("100�ʰ��Դϴ�");
		}
		/*����ڰ� �Է��Ͽ�
		 * ���ǿ� �´� �޼����� ����Ͻÿ�
		 * ù��° ���ڰ� * �� ��° ���ڰ��� ���� ����� ���
		 * �� �ش� ����� 15 
		 */
	}

}
