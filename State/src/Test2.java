import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int mon = 100000;
		System.out.println("�Ա��� 1�� ����� 2��");
		int input = sc.nextInt();
		
		
		if(input == 1) {
			System.out.println("�Ա� �ݾ��� �Է��ϼ���");
			int inmon= sc.nextInt();
			mon = mon + inmon;
			System.out.println(mon);
		}
		else {
			System.out.println("��� �ݾ��� �Է��ϼ���");
			int outmon = sc.nextInt();
			if(outmon>mon) {
				System.out.println("�����׺��� ���� �ݾ��� �Է��ϼ���");
			}
			else {
			mon = mon - outmon;
			System.out.println(mon);
			}
		}
		
	}

}

/*
 * ���� �ڽ��� ���忡�� ��,����� �ϴ� ���μ����� �����ؾ� �մϴ�.
 * ���� �⺻ �ڻ�ݾ� : 100000
 * 1�� �Է½� �Ա�, 2�� �Է½� ��� �Դϴ�.
 * 1�� �Է½� "�ش� �ݾ��� �Է��ϼ���"
 * ����ڰ� �Է��� �ݾ� + �⺻ �ڻ�ݾ��� ���� �� �ڻ�ݾ�
 * 
 * 2���� �Է½� "����� �ݾ��� �Է��ϼ���"
 * ����ڰ� �Է��� �ݾ� - �⺻ �ڻ�ݾ��� ����Ͽ�
 * �� �ڻ�ݾ��� ���.
 * */
 