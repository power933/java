import java.util.Scanner;

public class Scan1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("����� ���̴�? : ");
		int c = sc.nextInt();
		System.out.print("����� ���̴�? : ");
		int d = sc.nextInt();
		
		System.out.println(c+d);
	
		Scanner sc1 = new Scanner(System.in);
		System.out.print("�Է��Ͻ� �ݾ��� �����ּ��� : ");
		
		int e = sc1.nextInt();
		
		if(e<1000) {
			System.out.println("1000�� �̻� �ݾ��� �����ּ���.");
		}
		else {
			System.out.println("�Ա��� ����˴ϴ�.");
		}
		
	}

}
