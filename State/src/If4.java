import java.util.Scanner; 
// import : 자바에 있는 파일을 로드할때 사용하는 언어
// export : 자바에 있는 파일을 별로도 내보낼 수 있는 언어

//java.util 패키지 안에 Scanner 클래스 부분을 로드 하게 됩니다.
//java.util 패키지는 그냥 사용 하지 못하며 new를 할당하여 구분자를 사용해야함.
//단, 해당 코드 위치가 작성코드보다 아래에 있으면 안됩니다.

public class If4 {

	public static void main(String[] args) {
		
		//new : 객체를 선언하는 것을 말함.
		Scanner sc = new Scanner(System.in);
		//system.in != system.out
		System.out.println("id를 입력하세요");
		
		String mid = sc.nextLine();
		
		//next() : 사용자가 입력하는 형태를 말합니다.(숫자, 문자를 입력 받는 형태)
		
		
		if(mid == "kim") {
			System.out.println("등록된 회원 입니다.");
		}
		else {
			System.out.println("등록되지 않은 회원입니다.");
		}
		
		
		
		
	}

}
