import java.util.Arrays;

public class Method7 {

	public static void main(String[] args) {

		apink ap = new apink("홍길동", 25, "test@test.com", 1000);
		System.out.println(ap.data1());
		System.out.println(ap.data2());

	}

}

class apink {
	// private 선언은 class 필드에서 생성해야 합니다
//	String nm2;
	private String nm;
	private int age;
	private String email;
	private String email_cp;
	private int point;

	public void names() {
		if (this.nm == "홍길동") {
			this.nm = "hong";
			String[] e = this.email.split("@"); // 이메일중에 이메일 회사 정보만 가져오기 위한 배열로 나누는 작업
			this.email_cp = e[1];

		}
	}

	public apink(String nm1, int age2, String email3, int point4) {
		this.nm = nm1; // setter 형태
		this.email = email3;
		if (point4 <= 0) {
			this.point = 0;
		} else {
			this.point = point4;
		}
		names();
	}

	public String data1() {
		names();
		return this.email_cp; // return 및엔 코드 작성 금지
	}

	public int data2() {
		// getter 형태
		return this.point;
	}

}