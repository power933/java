import java.util.Scanner;

public class Loop_scan3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("���ϴ� �����ܴܼ� �Է�");
		int dan = sc.nextInt();
		int a = 1;
		System.out.printf("%d�� �������� : ", dan);
		do {
			System.out.print(a*dan + " ");
			a++;
		}while(a<10);
		sc.close();
	}

}
