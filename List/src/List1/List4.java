package List1;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class List4 {

	public static void main(String[] args) {
		
		Integer a[]= {3,6,9,12,15};
		LinkedList<Integer> ln = new LinkedList<>(Arrays.asList(a));	
		//��� ����Ʈ���� �� ����.  ��, ������ �� �� ����, �Խ��� ���鶩 ���, �������������� ��ũ��
		ln.add(33);
		System.out.println(ln);
		
		Scanner sc = new Scanner(System.in);
		String user;
		LinkedList<Integer> list = new LinkedList<>(); //��迭 ����
		while(true) {
			System.out.println("���ڸ� �Է� �ϼ���");
			user = sc.next();
			try {	//����ڰ� �Է��� ���� ������ �ִ��� Ȯ���ϴ� ��Ʈ
				int number = Integer.parseInt(user);
				//�Է°��� ��Ʈ���� �Ȱɷ� �� �޶�����?
				list.add(number);
				int ea = list.size();
				if(ea > 5 ) {	//5������ �迭�� �ԷµǸ� ���ѷ��� ����
					break;
				}
			}
			catch(Exception e) {	//������ �߻��Ͽ������ �۵��ϴ� �ڵ�
				System.out.println("�ش� �Է»����� �����Դϴ�  ���ڸ� �Է��ϼ���");
				
			}
			System.out.println(list);
		}
		
	}

}
