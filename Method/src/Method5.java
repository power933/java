
public class Method5 {

	public static void main(String[] args) {

		cdb c = new cdb();
		c.d1 = "홍길동";
		c.d3 = "이순신";
		c.data1();
//		c.d2 = "강감찬";  -> private으로 선언한 객체 이므로 메인 클레스에서 선언 불가
		String user = "";
		c.data2("강감찬");
//		System.out.println(c.data3());
	}

}

class cdb {
	String d1 = null; // void,자료형 메소드 로드 가능
	private String d2;
	public static String d3; // 모두 사용 가능
	
	public static void data1() {
		System.out.println(d3);
	}

	public void data2(String user) {
		this.d2 = user;
		int a1 = 0;
		System.out.println(d2);
		String d1 = "지역";
		this.d1 = "전역";
		System.out.println(d1);
		System.out.println(this.d1);
	}

	public String data3() {
		int a1 = 0;
		String a = d2;
		return a;
	}

}