package List1;

import java.util.ArrayList;
import java.util.Scanner;

public class list5 {

	public static void main(String[] args) {
		
		/*
		 	����ڰ� ���� �ݾ��� �Է��մϴ�.
		 	�ش� ���� �ݾ� Ƚ���� �� 8�� �Դϴ�.
		 	0~n ���� �Է�.
		 	�ش� �Է��� ��� ������ ���� �հ� �ݾ��� ��½�Ű�ÿ�.
		 	����
		 	�Ա��� �ݾ��� ��������
		 	500 600 .....
		 */
		
		ArrayList<Integer> li = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		String a;
		for(;;) {
			System.out.println("�Ա��� �ݾ��� ��������");
//			int b = sc.nextInt();	���� �־ ������ ĳġ���� ���� �����̵�. ��Ʈ������ �޾Ƽ� ��Ʈ�� �ٲ������
			try {
				a = sc.next();
				li.add(Integer.parseInt(a));
				sum += Integer.parseInt(a);
				if(li.size()>7) {
					System.out.println(sum);
					break;
				}
			}
			catch(Exception e){
				System.out.println("���ڸ� �Է��ϼ���");
			}
		}
	}

}
