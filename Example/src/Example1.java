import java.util.Scanner;

public class Example1 {

	public static void main(String[] args) {
		
		/* while������ �ڵ带 �ۼ�.
		����ڰ� ��ǰ�� ��ü �����Ͽ��� ��ǰ �� �ݾ��� 70000 �Դϴ�.
		ù ��° ������ "7000 �����Ͻðڽ��ϱ�?"��� ��µǸ�
		
		 	���� 1�̶�� �Է��ϸ� �������� �ݾ׿� �߰� �Ǿ� ���ϴ�.
		 	�� 2��� �Է½� ���������ݾ׿� �߰��Ǿ����� �ȵ˴ϴ�.
		 	
		 	�� ���� Ƚ���� 4�� �Դϴ�.
		 	�������� ���� ���� �ݾ��� �������� �ڵ带 �ۼ��Ͻÿ�
		 */
		Scanner sc = new Scanner(System.in);
		int selc = 0;
		int total = 70000;
		int a = 0;
		while(a<4) {
			System.out.println("7000 �����Ͻðڽ��ϱ�?");
			selc = sc.nextInt();
			if(selc == 1) {
				total+=7000;
			}
			else if(selc == 2) {
				
			}
			a++;
		}
		
		System.out.println(total);
	}

}
