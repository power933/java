import java.util.Scanner;

public class Example2 {

	public static void main(String[] args) {
		
		/*
		 	사용자가 입력한 숫자에 맞춰 구구단이 작동되며
		 	구구단 결과를 계산하여 짝수인지 홀수인지 출력하시오
		 */
		
		Scanner sc = new Scanner(System.in);
		int a = 0;
		System.out.print("구구단에 대한 숫자를 입력하세요 :");
		int b = sc.nextInt();
		int sum = 0;
		
		for(int i=1; i<10;i++) {
			sum +=b*i;
		}
		System.out.println(sum);
		if(sum%2 ==0) {
			System.out.println("짝수입니다");
		}
		else {
			System.out.println("홀수입니다");
		}
		
	}

}
