import java.util.Scanner;

public class Loop_scan1 {

	public static void main(String[] args) {
		//for�� + ��ĵ
		//���Ͻô� ������ ���� �Է��ϼ���
		
		Scanner aa= new Scanner(System.in); // �Է�
		System.out.println("���Ͻô� ������ ���� �Է��ϼ���");
		int bb = aa.nextInt(); //����ڰ� �Է��� ����
		int f; //�ݺ����� ����ϴ� ����
		int zz; //�ݺ����� ������� �����
		
		for(f=1;f<=9;f++) {
			zz = bb*f; //�������
			System.out.print(zz + " "); //���
		}
		aa.close(); //����
		
		
	}

}
