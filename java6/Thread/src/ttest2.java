import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ttest2 {
	
	public void search(String x) {
		String arr[] = {"������", "�ǿ�ȯ", "�ݻ���", "�赿��", "�����", "������", "����ȣ", "����"};
		ArrayList<String> al = new ArrayList<>(Arrays.asList(arr));
		
		for(int i = 0; i<al.size();i++) {
			if(al.get(i).equals(x)) {
				System.out.println("�ش� ����ڰ� �ֽ��ϴ�");
			}
			else {
				System.out.println("�ش����ڰ� �����ϴ�");
			}
		}
		
	}
	
	public void userinput() {
		Scanner sc = new Scanner(System.in);
		System.out.println("���� 8�� �Է�");
		int result = 0;
		for(int i = 0; i<8;i++) {
			int tmp = sc.nextInt();
			result += tmp; 
		}
		System.out.println(result);
	} 
	public static void main(String[] args) {
		
		ttest2 t = new ttest2();
		t.userinput();
		Scanner sc1 = new Scanner(System.in);
		String a = sc1.next();
		t.search(a);
		/*
		 [TEST2]
[����1]
�� 8���� ����ڰ� ���ڸ� �Է� �մϴ�. �ش� ���ڸ� �Է��ϴ� Scanner�� userinput�̶�� �޼ҵ� ���� ó���� �ؾ� �ϸ�
�ش� ��� ���� ���� ���� �����  result���� ���� ��� �ǵ��� �ϴ� ���α׷��� �����Ͻÿ�.
��Ʈ (�ܺ�Ŭ�������� �޼ҵ�2�� ����)

[����2]
�˻��� ����� �̸��� �˻��ϰ� �˴ϴ�. (���� �޼ҵ忡�� ����)

����� ����Ʈ�� ������ �����ϴ�.  (�ܺ� Ŭ���� �� �ܺ� �޼ҵ忡�� ����)
������, �ǿ�ȯ, �ݻ���, �赿��, �����, ������, ����ȣ, ����

�ش� ����Ʈ ������ ������ �޼ҵ� ���� �����ؾ� �մϴ�.
����ڰ� �Էµ� �̸��� ���� ��� "�ش� ����ڰ� �ֽ��ϴ�." ��� ����ϰ�
���� ��� "�ش� ����ڴ� ���� ���� �ʾҽ��ϴ�." ��� ����մϴ�.

��Ʈ : ���θ޼ҵ忡�� Scanner �۵� �ϸ�, ������ �˻��� �ܺ� Class �� �ܺ� �޼ҵ忡�� ó��


		 */
	}
}
