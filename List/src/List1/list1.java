package List1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class list1 {

	public static void main(String[] args) {
		
		//add(�߰�),get(������ �ε�),remove(����),size(�����Ͱ���) : ArrayList��� util�޼ҵ忡�� ����ϴ� �κ�
		//Arrays.asList : �ε��� �迭 ������ ����
		//�߿� : add�� �Ϲ������� �� �ڿ� �����Ͱ� �߰��� ��, index��ȣ�� ���� �� ���� �����ϸ� 
		//�ش� �ε��� �κп� �߰��� �˴ϴ�.
		String member[] = {"�̼���","ȫ�浿","������","������"};
		ArrayList<String> mb = new ArrayList<>(Arrays.asList(member));
		System.out.println(mb);
		int ea = mb.size();
		System.out.println(ea);
		mb.add("������");
		System.out.println(mb);
		mb.remove(1);
		System.out.println(mb);
		mb.add(3,"�������");
		System.out.println(mb);
		String checks = mb.get(2);
		System.out.println(checks);
		
		/*
		 	�Ʒ� �����͸� Ŀ���� �Ͽ� ���� ���ó�� ����Ͻÿ�
		 	[7,15,22,8,11,39,41]
		 */
		//ArrayList������ int�� ������� ����(integer)�� ����Ұ�
		Integer[] numbers = {15,22,37,8,11,19,41};
		
		ArrayList<Integer> in = new ArrayList<>(Arrays.asList(numbers));
		in.remove(5);
		in.remove(2);
		System.out.println(in);
		in.add(0,7);
		in.add(5,39);
		System.out.println(in);
		
		
	}

}
