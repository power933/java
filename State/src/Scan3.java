import java.util.Scanner;

public class Scan3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("���ڸ� �Է����ּ��� : ");
		int a = sc.nextInt();
		
		//���� �����鼭 ���������� Ȯ���ϴ� ���ı�
		if(a%2==0) {
			System.out.println("¦���Դϴ�.");
		}
		else {
			System.out.println("Ȧ���Դϴ�");
		}
		
	}

}
