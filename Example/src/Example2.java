import java.util.Scanner;

public class Example2 {

	public static void main(String[] args) {
		
		/*
		 	����ڰ� �Է��� ���ڿ� ���� �������� �۵��Ǹ�
		 	������ ����� ����Ͽ� ¦������ Ȧ������ ����Ͻÿ�
		 */
		
		Scanner sc = new Scanner(System.in);
		int a = 0;
		System.out.print("�����ܿ� ���� ���ڸ� �Է��ϼ��� :");
		int b = sc.nextInt();
		int sum = 0;
		
		for(int i=1; i<10;i++) {
			sum +=b*i;
		}
		System.out.println(sum);
		if(sum%2 ==0) {
			System.out.println("¦���Դϴ�");
		}
		else {
			System.out.println("Ȧ���Դϴ�");
		}
		
	}

}
