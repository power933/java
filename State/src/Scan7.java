import java.util.Scanner;

public class Scan7 {

	public static void main(String[] args) {
		
		int sc = 220524;
		System.out.println("인증받은 번호를 입력하세요");
		Scanner pw = new Scanner(System.in);
		int pw1 = pw.nextInt();
		if(pw1 == sc) {
			System.out.println("인증 확인 되셨습니다");
		}
		else {
			System.out.println("인증번호가 틀립니다.");
		}
		pw.close();
	}

}


/*
 * 인증받은 번호를 입력하세요
 * 숫자 220524
 * 
 * 사용자가 숫자 220524 외에 입력시 
 * "인증번호가 틀립니다" 라고 출력하고
 * 동일한 인증번호 숫자를 입력시
 * "인증확인 되셨습니다" 라고 출력.
 * 
 * 단,220524는 java실행시 가장 먼저 실행되는 변수로서 처리하세요
 * */

