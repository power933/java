import java.util.Arrays;

public class App {

	public static void main(String[] args) {
		
		int a = 25+31*4+12;
		int b = 15*3+9+14;
				
		if(a>b) {
			System.out.println(b);
		}
		else if(a<b)
			System.out.println(a);
		else
			System.out.println("�� ���� ����");
		
		//�ش簪�� 2������ ¦��, Ȧ���� Ȯ���ϱ�
		int c = 11%2; // %�� ��ȣ�� ���� 0 �Ǵ� 1�� ������ ���� ����� �˴ϴ�.
		System.out.println(c);
		
		if(b%2 == 0) {
			System.out.println("¦�� �Դϴ�.");
		}
		else {
			System.out.println("Ȧ�� �Դϴ�.");
		}
		int x = 0;
		int arr[] = new int[x];
		for(int i = 0; i<=4;i++) {
			
			System.out.println(Arrays.toString(arr));
		}
		
	}

}
