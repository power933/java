import java.util.Scanner;

public class Scan4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("�Է��� ������ �����ּ���");
		String memo = sc.nextLine(); // next�� �����̽��� ������ �Է�, nextLine �� �� ��ü�� �Է�(�����̽�����)
		
		System.out.println(memo);
		
		sc.close(); //��ĳ�ʸ� ���� �Ȳ��� �޸� ����
		
		
		
		String name = "park"; //string = %s, $s = ���� + string
		double num = 25; // %d = ����,%f = �Ǽ�, %t = date,time %b = boolean
		
		//System.out.println(name + "���� ���̴�"+num+"�Դϴ�.");
		System.out.printf("%s���� ���̴� %f �Դϴ�", name,num); //printf : f��� ���� format�� ����
	}

}
