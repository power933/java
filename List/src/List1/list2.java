package List1;

import java.util.ArrayList;
import java.util.Arrays;

public class list2 {

	public static void main(String[] args) {
		
		/*
		 	�ش� ������ ���� �޸�� �����ʹ� ��� ���� �ؾ� �մϴ�.
		 	�� ������
		 	{"�����","������","��â��","�ڵ���","�̰���","�����","������"}
		 	��� �����,������
		 */
		String user[] = {"�����","������","��â��","�ڵ���","�̰���","�����","������"};
		ArrayList<String> data = new ArrayList<>(Arrays.asList(user));
		for(int i = 0; i<data.size();i++) {
			for(int j = 0;j<data.size();j++ ) 	//node�� ������ �ٽ� �ľ���
			if(!data.get(j).equals("�����") && !data.get(j).equals("������"))  {
				data.remove(j);
				
			}
		}
		System.out.println(data);
		/*
		 	¦�� ���ڸ� ��� ���� �մϴ�.
		 	{10,7,6,1,11,37,41,22}
		 */
		Integer x[] = {10,7,6,1,11,37,41,22};
		ArrayList<Integer> x1 = new ArrayList<>(Arrays.asList(x));
		ArrayList<Integer> x2 = new ArrayList<>(Arrays.asList(x));
		for(int i = 0; i<x1.size();i++) { 
			for(int j = 0;j<x1.size();j++) {  
				if(x1.get(j)%2 == 0) {
					x1.remove(j);
				}
			}
		}
		System.out.println(x1);
		
		int w = 0;
		while(w<x2.size()) {
			int ww = 0;
			while(ww<x2.size()) {
				if(x2.get(ww)%2 == 0) {
					x2.remove(ww);
				}
				ww++;
			}
			w++;
		}
		System.out.println(x1);
		
	}

}
