package List1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class list6 {

	public static void main(String[] args) {
		//���ڿ� ���� �迭���, object�� �޾Ƽ� ���� Ȥ�� ���ڸ� �ܾ����(object + try catch)
		
		Scanner sc = new Scanner(System.in);
		ArrayList list = new ArrayList();
		String xx[] = new String[3];
		int sum1 = 0;
		int w = 0;
		while (w<5) {
			System.out.println("�����͸� �Է��� �ֽñ� �ٶ��ϴ�.");
			String user = sc.next();
			list.add(user);
			
			w++;
		}
		int ww=0;
		do {
			try {
				sum1 += Integer.parseInt(String.valueOf(list.get(ww)));	//object -> String -> integer �� ��ȯ
			}catch(Exception e) {	//�迭 object�� ���ڰ� �ƴ� ���
				xx[ww] = String.valueOf(list.get(ww));
				
			}
			ww++;
		}while(ww<list.size());
		System.out.println(sum1);
		System.out.println(list);
		Object a = list.get(0);
		Object b = list.get(1);
		System.out.println(Arrays.toString(xx));
		
	}

}
