import java.util.Scanner;

public class Scan5 {

	public static void main(String[] args) {
		
		byte a = 45;
		if(a < 10) {
			System.out.println("�Է��� ���� 10���� �Դϴ�");
		}
		else if(a >= 10 || a<=22) { 
			System.out.println("��÷");
		}
		else {
			System.out.println("�������� ���� �Դϴ�.");
		}
		//if�� ������ ���ǰɶ� �� �����Ұ�(���� ��������?)
		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("1~45�� ���� �ϳ� �Է��ϼ��� : ");
		int b = sc.nextInt();
		if(b<=45 && b>=1) {
			if(b == 7 || b==12||b==14) {
				System.out.println("��÷�Դϴ�");
			}
			else {
				System.out.println("������ȸ��");
			}
		}
		else if(b==0){
			System.out.println("�����Է��� �߸� �Ǿ����ϴ�");
		}
		else if(b>45) {
			System.out.println("���ڴ� 1~45������ �Է����ּ���.");
		}
		// �����ϸ� �տ��� ���� �� �Ĺ����� ������ else�� �θ� ���߿� �����Ҷ� ����
		
	}

}
