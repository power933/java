import java.util.Arrays;

public class test1 {
	
	public void test() {
		for(int i = 1; i<11;i++) {
			System.out.println(i);
		}
	}
	
	public int test2(int a) {
		return a*7;
	}
	public static void main(String[] args) {
		
		test1 t = new test1();
		t.test();
		t.test2(5);
		sp s = new sp();
		System.out.println(Arrays.toString(s.spp("honggildong")));
		
		
		/*
		 * TEST1]
[����1] 
���� Class�� public void test()�� �ϳ� �����մϴ�.
main Ŭ�������� �ش� test �޼ҵ尡 ���� �ǵ��� �ϸ� test �޼ҵ�� ������ ���� ó���� �Ǿ�� �մϴ�.
1~10���� �ַܼ� ��� �Ǿ�� ��. 
��Ʈ(setter)

[����2]
���� Class�� return �޼ҵ带 �ϳ� �����մϴ�. ��, return �޼ҵ�� ����(����)�� ó���ϴ� �޼ҵ� �Դϴ�.
main �޼ҵ忡�� �ش� return �޼ҵ�� ���� 5�� ���ڰ����� �����ϴ�.
return �޼ҵ忡���� �ش� ���ڸ� ���� �� ���ϱ� 7�� �Ͽ� ��� ���� main �޼ҵ�� ������ main���� ������� 
��� �ǵ��� �մϴ�. 
��Ʈ(getter)
		 */
		
		
	}
}

class sp{
	public String[] spp(String a){
		String re[] = a.split("");
		return re;
	}
}
