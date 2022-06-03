import java.util.Arrays;
import java.util.Scanner;

public class Example6 {

	public static void main(String[] args) {

		/*
		 * 2차배열이며, 2차배열 데이터는 다음과 같습니다. userlist : 홍길동 이순신 강감찬 유관순 세종대왕 김유신 게백장군
		 * user_point : 3000 1000 25000 19800 5750 3630 0
		 * 
		 * 프로그램 시작과 동시에 "포인트를 검색할 고객명을 입력하세요" 입력한 값은 별도의 class를 제작하여 해당 메소드 값으로 매개변수를
		 * 이용하여 전달 후 해당 결과값을 출력하시오
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("포인트를 검색할 고객명을 입력하세요");
		String user = sc.next();

		ulist u = new ulist();
		u.serch(user);

	}

}

class ulist {

	String user[][] = { { "홍길동", "이순신", "강감찬", "유관순", "세종대왕", "김유신", "계백장군" },
			{ "3000", "1000", "25000", "19800", "5750", "3630", "0" } };
	String x = "";

	public void serch(String str) {
		for (int i = 0; i < user.length; i++) {
			for (int j = 0; j < user[i].length; j++) {
				if (user[i][j].equals(str)) {
					x = user[1][j];
				}
			}
		}
		System.out.println(x);
	}
}
