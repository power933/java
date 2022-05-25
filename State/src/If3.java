
public class If3 {

	public static void main(String[] args) {
		
		//boolean 은 true , false 로 구분하게 됩니다.
		boolean ck=true;
		if(ck==true) {
			System.out.println("회원가입이 진행 됩니다.");
		}
		else {
			System.out.println("이용약관에 동의하셔야 합니다.");
		}
		
		String mid = "kim", mpass="a1234";

		//&& : 한가지 조건 이상 모두 맞을경우
		//|| : 한가지 조건 이상에서 한개라도 맞을 경우.
		if(mid=="park" && mpass=="a1234") {
			System.out.println("로그인에 성공하셨습니다.");
		}
		else {
			System.out.println("아이디와 패스워드를 확인해주세요.");
		}
		
		if(mid=="park" || mid=="kim") {
			System.out.println("회원이 확인 되었습니다.");
			
		}
		else
			System.out.println("확인된 id가 없습니다");
		
	}

}
