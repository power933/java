
public class Method5 {

	public static void main(String[] args) {

		cdb c = new cdb();
		c.d1 = "ȫ�浿";
		c.d3 = "�̼���";
		c.data1();
//		c.d2 = "������";  -> private���� ������ ��ü �̹Ƿ� ���� Ŭ�������� ���� �Ұ�
		String user = "";
		c.data2("������");
//		System.out.println(c.data3());
	}

}

class cdb {
	String d1 = null; // void,�ڷ��� �޼ҵ� �ε� ����
	private String d2;
	public static String d3; // ��� ��� ����
	
	public static void data1() {
		System.out.println(d3);
	}

	public void data2(String user) {
		this.d2 = user;
		int a1 = 0;
		System.out.println(d2);
		String d1 = "����";
		this.d1 = "����";
		System.out.println(d1);
		System.out.println(this.d1);
	}

	public String data3() {
		int a1 = 0;
		String a = d2;
		return a;
	}

}