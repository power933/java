
public class Method2 {

	public static void main(String[] args) {
		//default package�� ��� �� �ش� Ŭ�������� ȣ���ϸ� �� 
		// �� package�� �������� ��� ���� ��ܿ� package�� �����ؾ���
//		test ts = new test();
//		ts.a2++;
//		System.out.println(ts.a2);
		
		info i = new info();
//		System.out.println(i.data2(20)); -> error
		System.out.println(i.data3(20));
		
		String result = i.data4("ȫ�浿");
		System.out.println(result);
	}

}

class info{
	int a;
	public static void data1(int abc) {
		int z = abc + 20;
//		return z;
	}
	public void data2(int abc) {
		int z = abc + 20;
//		return z;
	}
	
	public int data3(int abc) {
		int z = abc + 20;
		return z;
	}
	
	public String data4(String abc) {
		String z = abc + "�� ȯ���մϴ�";
		return z;
		
	}
}