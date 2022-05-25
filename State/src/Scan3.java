import java.util.Scanner;

public class Scan3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력해주세요 : ");
		int a = sc.nextInt();
		
		//값을 나누면서 나머지값을 확인하는 수식구
		if(a%2==0) {
			System.out.println("짝수입니다.");
		}
		else {
			System.out.println("홀수입니다");
		}
		
	}

}
