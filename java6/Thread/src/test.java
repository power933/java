import java.util.ArrayList;
import java.util.Scanner;

public class test extends ab{
	
	test(){
		choice();
	}
	@Override
	public void choice() {
		Scanner sc = new Scanner(System.in);
		System.out.println("1: ��� 2: ���� 3: Ű��");
		int a = sc.nextInt();
		System.out.println("���� ���� �Է�");
		int b = sc.nextInt();
		
		cal(a,b);
		
	}
	
	@Override
	public void cal(int a, int b) {
		try {
			String[] list = {"���=1000","����=1000","Ű��=1000"};
			String [] tmp = list[a-1].split("=");
			System.out.println("�� �ݾ��� " + Integer.parseInt(tmp[1])*b + "�Դϴ�");
		} catch (Exception e) {
			System.out.println("���ڸ� ��Ȯ�� �Է����ּ���");
			choice();
		}
		
		
	}
	public static void main(String[] args) {
		test t = new test();
	}
	
}

abstract class ab{
	public abstract void choice();
	public abstract void cal(int a, int b);
}