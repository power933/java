package List1;

import java.util.ArrayList;
import java.util.Arrays;

public class list7 {

	public static void main(String[] args) {
		
		/*
		 	ArrayList �Ǵ� ��ũ�� ����Ʈ �� �߿� ���ϴ� �޼ҵ带 ����
		 	2���迭 ����
		 	�ش� ������ ���� ��� ���Ͽ� ¦�� ���� Ȧ�� ������ Ȯ�� �Ͻÿ�.
		 	Integer data[][] = {
		 		{10,20,30,40,50,60,70},
		 		{3,6,9,12,15,17,19}
		 	};
		 	
		 	�� ���� ~ �̰� ¦���Դϴ�
		 */
		Integer data[][] = {
		 		{10,20,30,40,50,60,70},
		 		{3,6,9,12,15,17,19}
		 	};
		
		ArrayList<Integer> al = new ArrayList<>();
		int sum = 0;
		String n = "";
		for(int i = 0;i<data.length;i++) {
			for(int j = 0;j<data[i].length;j++) {
				al.add(data[i][j]);
			}
		}
		for(int i = 0; i<al.size();i++) {
			sum += al.get(i);
		}
		if(sum%2 == 0) {
			n = "¦��";
		}
		else {
			n = "Ȧ��";
		}
		System.out.printf("�� ���� %d �̰� %s�Դϴ�",sum,n);
	}

}
