
public class Method12 {

	public static void main(String[] args) {
		//extened�� ����� �ڽ� class�� �ε� �ϰ� �Ǹ� �ڵ����� �θ� class�� �Բ� ����� ���� �մϴ�.
		bbox2 bx = new bbox2();
		bx.b2("�̼���");
		System.out.println(bx.abc());
	}

}

class bbox{ //�⺻ �ܺ� class1 main���� �ʿ��� ������ üũ
	protected String user_info;
	public String user_pw;
	public String user_rpw;
	public bbox() {
//		this.user_info = "ȫ�浿";
		this.user_pw = "abcd";
		this.user_rpw = this.user_pw.replace("abcd", "a1b1c1d1");
	}
	public String abc() {
		String email = "hong@naver.com";
		return email;
	}
}

class bbox2 extends bbox{ //bbox�� ���� ��� ������ bbox2�� �����ϰԵ�.
	// �� private ���� ���õȰ��� �������� ����
	public void b2(String nm) { //main class���� bbox2�� �ε� �� 
//								�ش簪�� �μ����� �����Ͽ� bbox class�� �ִ� �ʵ�� �� user_info�� �����ϰ� �Ǵ� ���� 
		this.user_info = nm;
		System.out.println(this.user_info);
		System.out.println(this.user_rpw);
	}
}