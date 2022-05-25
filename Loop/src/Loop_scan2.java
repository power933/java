import java.util.Scanner;

public class Loop_scan2 {

	public static void main(String[] args) {
		// 스캐너와 함께 while문으로 사용자가 입력하는 값으로 구구단 결과가 출력되는 프로그램 제작
		
		Scanner sc = new Scanner(System.in);
		System.out.println("원하는 구구단 단수 입력");
		int dan = sc.nextInt();
		int a = 1;
		
		while(a<10) {
			System.out.print(dan*a+" ");
			a++;
		}
		sc.close();
	}

}
