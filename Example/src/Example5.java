import java.util.Arrays;

public class Example5 {

	public static void main(String[] args) {

		/*
		 	2���迭 + �⺻ �޼ҵ�
		 	��ϵ� ���� vip ���� ����Ʈ�� ����Ͻÿ�
		 	
		 	user_list : ȫ�浿 �̼��� ������ ������ ������� ������ ����屺
		 	user_level : gold vip guest gold vip vip guest
		 */
		
		String arr[][] = {{"ȫ�浿","�̼���","������","������","�������","������","����屺"},
							{"gold","vip","guest","gold","vip","vip","guest"}};
		Example5 ex = new Example5();
		ex.vip(arr);
		
	}
	public void vip(String arr[][]) {
		String tmp[] = new String[arr[1].length];
		int count = 0;
		
		for(int i =0; i<arr.length; i++) {
			for(int j = 0; j<arr[i].length;j++) {
				if(arr[i][j].equals("vip")) {
					tmp[count] = arr[0][j];
					count++;
				}
				
			}
		}
		System.out.println(Arrays.toString(tmp));
	}
}
