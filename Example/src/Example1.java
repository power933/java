
public class Example1 {

	public static void main(String[] args) {
		
		/*
		 	�迭 + �޼ҵ�
		 	�迭 ����Ʈ 22 33 44 55 66 77 88 99 �̸�
		 	�ش� ��ü���� ��� ���� �� �հ谪�� ������ �޼ҵ��
		 	ó���ǵ��� �մϴ� �� �ݺ����� ������ do-while�� �ۼ�
		 */
		int arr[] = {22,33,44,55,66,77,88,99};
		Example1 ex = new Example1();
		ex.datas(arr);
		//void�� : ��ü���� + �ν��Ͻ�(�޸�)���
	}
	
	public void datas(int arr1[]) {
		int i = 0;
		int sum = 0;
		do {
			sum+=arr1[i];
			
			i++;
		}while(i<arr1.length);
		
		System.out.println(sum);
		
		
	}

}
