import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Example4 {

	public static void main(String[] args) {
		
		/*
		 	�迭���� + �⺻(Ŭ����)�޼ҵ� ����
		 	����ڰ� ���� ������ ���� �Է��ϰ� �˴ϴ�
		 	"�б� �л� �̸��� �Է��� �ּ���"
		 	�� �迭 �����ʹ� 5���� ���� �Ǿ����ϴ�
		 	������ �޼ҵ忡�� �ش� ����ڰ� �Է��� ���� �迭�� �����Ͽ� 
		 	����Ͻÿ�
		 	����ڰ� �Է��� ���� : hong kim park lee jang
		 	��� [hong,kim,park,lee,jang]
		 */
		Example4 ex = new Example4();
		Scanner sc = new Scanner(System.in);
		String x = "";
		for(int i =0; i<5;i++) {
			System.out.println("�̸��� �Է��ϼ���");
			String a = sc.next();
			x += a + ",";
		}
		ex.input(x);
		
	}
	public void input(String a1) {
		String[] a2 = a1.split(" ,");
		System.out.println(Arrays.toString(a2));
	}
}
