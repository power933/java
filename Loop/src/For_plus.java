
public class For_plus {

	public static void main(String[] args) {
		// 1���� 10���� ��� ���ڸ� ���� ������� ����Ͻÿ�
		
		int f;
		int total = 0;
		for(f=1;f<11;f++) { //total �������� �ݺ����� ���������� ������Ŵ
			//total = total+ f;
			total+=f;
		}
		//System.out.println(total);
		// += : ���ϱ� �Ҵ� ��ȣ  -= : ���� �Ҵ� ��ȣ *=,/= 
		
		/*��ü���� 500�� �ֽ��ϴ�.
		 * �� 8ȸ���� �ݺ��Ǹ鼭 �ѹ� �ݺ��� �� ���� 12�� �����ϵ��� �Ͽ�
		 * �������� ����Ͻÿ�
		 */
		int sum = 500;
		for(int i = 0;i<8;i++) {
			sum-=12;
		}
		System.out.println(sum);
		
		//������ 2�� 2*1~2*9������ �� �հ�
		int sum1 = 0;
		for(int a = 1; a<10;a++) {
			sum1+=2*a;
		}System.out.println(sum1);
	}

}
