
public class Method3 {

	public static void main(String[] args) {
		/*
		 	���빮��. �μ��� 2���� ���ڸ� �����Ͽ� ���ǵ��� �մϴ�.
		 	���� ����� �޾Ƽ� ����� ����Ͻÿ�
		 	157,45
		 	157*45
		 	���� ����� ��� : 
		 */
		cal ca = new cal();
		System.out.println(ca.mul(157, 45));
		ca.m2();
		ca.mul();
		
		/*
		 	���� ���� �ϳ��� �ش� �޼ҵ�� ���� �ϰ� �˴ϴ�.
		 	�ش� �޼ҵ忡���� ������ ���� ó�� �մϴ�.
		 	���� 3�� �����ϸ� 3*1~3*9������ ��� ������� ���Ͽ�
		 	sysout���� ��µǵ��� �Ͻʽÿ�.
		 */
		ca.m3(3);
	}

}
class cal{
	public int mul(int a, int b) {
		return a*b;
	}
	public void mul() {
		System.out.println("test");
	}
	public void m2() {
		int z = mul(100,200);
		System.out.println(z);
	}
	public int gugu(int a) {
		int sum = 0;
		for(int i = 1; i<10; i++) {
			sum += i * a;
		}
		if(sum>100) {
			return 1;
		}
		return sum;
	}
	public void m3(int a) {
		System.out.println(gugu(a));
	}
	
	public String mb(String mid) {
		String msg;
		if(mid.equals("hong")) {
			msg = "ok";
		}
		else {
			msg = "cancel";
		}
		return msg;
	}
}