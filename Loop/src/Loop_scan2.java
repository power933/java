import java.util.Scanner;

public class Loop_scan2 {

	public static void main(String[] args) {
		// ��ĳ�ʿ� �Բ� while������ ����ڰ� �Է��ϴ� ������ ������ ����� ��µǴ� ���α׷� ����
		
		Scanner sc = new Scanner(System.in);
		System.out.println("���ϴ� ������ �ܼ� �Է�");
		int dan = sc.nextInt();
		int a = 1;
		
		while(a<10) {
			System.out.print(dan*a+" ");
			a++;
		}
		sc.close();
	}

}
