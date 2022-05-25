import java.util.Scanner;

public class Scan6 {

	public static void main(String[] args) {
		
		Scanner id = new Scanner(System.in);
		System.out.println("접속할 아이디를 입력하세요");
		String m = id.next();
		
		Scanner pass = new Scanner(System.in);
		System.out.println("패스워드를 입력하세요.");
		String p = pass.next();
		
		if(m.equals("jung") || m.equals("su")) {
			if(m.equals("jung") && p.equals("j1234")) {
				System.out.println("로그인 환영");
			}
			else if(m.equals("su") && p.equals("ssh")) {
				System.out.println("로그인 환영");
			}
			else {
				System.out.println("비밀번호를 확인 하세요");
			}
		}
		else {
			System.out.println("로그인실패");
		}

	}

}


/*
 * 회원가입 아이디 jung,su
 * 패스워드 jung - j1234
 *        su : ssh
 * 해당 아이디 외에는 가입되지 않은 사용자 입니다
 * 또한 패스워드가 틀릴경우 회원정보를 다시 확인 하세요.
 * 아이디 및 패스워드가 모두 맞을 경우 로그인 되셨습니다 라고 출력

*/