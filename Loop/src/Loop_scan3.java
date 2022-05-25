import java.util.Scanner;

public class Loop_scan3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("원하는 구구단단수 입력");
		int dan = sc.nextInt();
		int a = 1;
		System.out.printf("%d의 구구단은 : ", dan);
		do {
			System.out.print(a*dan + " ");
			a++;
		}while(a<10);
		sc.close();
	}

}
