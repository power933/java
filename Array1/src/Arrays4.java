import java.util.Arrays;

public class Arrays4 {

	public static void main(String[] args) {
		
		String[] names = new String[3]; //���� ���� �迭
		String m[] = {"ȫ�浿","�̼���","������"}; //�迭���� �����Ͱ� �ִ� ����
		
		int ct = 0; //foreach�� �ε��� ��ȣ �����Ƿ� ���� ����
		for(String a : m) { //String a : a�� �ּҳ��� ���� ���, m = �ּ�, �迭 ���̸�ŭ ���ư�
//			System.out.println(1);
			
			if(a.equals("ȫ�浿")|| a.equals("������")) { // �ش� �迭���� (����)�迭���� ���ǿ� �´� ���� �߷��� ���ο� �迭�� �߰�
				names[ct] = a;
				ct++; // �ε��� ��ȣ�� ���������� �����ϱ� ���� ������
				
			}
			
		}
//		System.out.println(Arrays.toString(names));
		
		
		/*
		 	����ڰ� ��ٱ��Ͽ� ������ ���� �ϰ� �˴ϴ�.
		 	��, �ش� �ݾ׸���Ʈ�� ������� ���� ���� ��ü ���� �ݾ׸� ��µǵ��� �մϴ�
		 	1500 22000 13000 14500 113800 45000
		 */
		int[] arr = {1500,22000,13000,14500,113800,45000};
		int total = 0;
		
		for(int i = 0; i<arr.length;i++) {
			total +=arr[i];
		}
		System.out.println(total);
	}

}
