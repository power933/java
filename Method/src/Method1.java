import java.util.Arrays;
import java.util.Scanner;

public class Method1 {

	public static void main(String[] args) {
		
		test t = new test();
//		t.a1++;
//		t.a2++;
		t.name1();
		test tt = new test();
//		tt.a1++;
//		tt.a2++;
		tt.name1();
		
		
//		t.b1 += "������";
//		t.b2 += "������";
		t.name2();
		
//		tt.b1 += "������";
//		tt.b2 += "������";
		tt.name2();
		
		
		Scanner sc = new Scanner(System.in);
		for(int i = 0;i<5;i++) {
			System.out.println("input");
			String ab = sc.next();
			t.te(ab, i);
		}
		System.out.println(Arrays.toString(t.a3));

	}

}

class test{
	
	int a1 = 1; //���ο� ��ü ���� �� Ŭ������ ȣ�� �� 1�̶�� ���ڸ� �ٽ� ������ �˴ϴ�.
	//��������
	static int a2 =1; //���ο� ��ü ���� �� Ŭ������ ȣ�� �ϴ��� 1�̶�� ���ڰ� �ƴ� �޸𸮿� ��ϵ� �������� ���������� ������ ��
	//��������
	
	String b1 = "�̼���";
	public static String b2 = "ȫ�浿";
	String[] a3 = new String[5];
	
	public void name1() {
//		System.out.println(a1);
//		System.out.println(a2);
	} 
	public void name2() {
		System.out.println(b1);
		System.out.println(b2);
		
	}
	
	public void te(String a, int in) {
		
			a3[in] = a;
		
	}
	
	
	
}