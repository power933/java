import java.util.Arrays;
import java.util.Scanner;

import javax.sound.midi.SysexMessage;

public class Array3 {

	public static void main(String[] args) {

		/*
		 * foreach ���� ����� ���� �ε��� ��ȣ�� �ʿ���� ����� ���. for,while ���� ����� ���� �ε��� ��ȣ�� �ʿ��� �� ���
		 */
		int[] data = { 5, 10, 15, 20, 25, 30, 35 };
		for (int f : data) { // int f�� ���������� data �迭���� �޾Ƽ� ���� ��ŵ�ϴ�.
//			if(f%2==0)
//			System.out.println(f);
		}

//		String pay[] = { "�������Ա�", "�ſ�ī��", "�޴��� ����", "��ǰ��", "����" };
//		Scanner sc = new Scanner(System.in);
//		System.out.println("�����ϰ��� �ϴ� ���¸� ������ �ּ���");
//		String pm = sc.nextLine();
//		for (String z : pay) { // �迭�����Ͱ� ���� �̹Ƿ� �޴� ���� ���� ���� �������� ����ؾ� �մϴ�
//			if (pm.equals(z)) {
//				if (z.equals("�޴��� ����")) {
//					System.out.println("���� �ý��� �������� �ش� ������ ����Ͻ� �� �����ϴ�");
//				} else {
//					System.out.println(pm + "�� ���� ���� �˴ϴ�");
//				}
//			System.out.println(pm+"�� ���� ���� �˴ϴ�");
//			}
//		}

		/*
		 * {"�ܹ���","����","ġŲ","Ŀ��"} "�ֹ��ϰ��� �ϴ� ������ ������ �ּ���." �ش� ������ �� 4���� ���� ���� �˴ϴ�. ��,
		 * "�ֹ�����"��� ����ڰ� �Է½� �� ��� �ֹ��� ����Ǹ� �ֹ� ������ ����Ͻø� �˴ϴ�.
		 */

		String[] food = { "�ܹ���", "����", "ġŲ", "Ŀ��" };
		String[] od = new String[food.length];
		Scanner sc = new Scanner(System.in);
		String sel = "";
		int i = 0;
		for (String s : food) {
			System.out.println("�ֹ��ϰ��� �ϴ� ������ �������ּ���");
			sel = sc.next();
			if (sel.equals("�ֹ�����")) {
				break;
			} else {
					if (sel.equals("�ܹ���") || sel.equals("����")||sel.equals("ġŲ")||sel.equals("Ŀ��")) {
						od[i] = sel;
					}else {
						System.out.println("��Ȯ�� �ֹ����ּ���");
						break;
					}
			}
			i++;
		}
		System.out.println(Arrays.toString(od));

	}

}
