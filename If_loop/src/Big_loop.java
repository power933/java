import java.math.BigInteger;

public class Big_loop {

	public static void main(String[] args) {
		/*
		 * int sum = 0; for (int i = 0; i < 101; i++) { sum += i; }
		 * System.out.println(sum);
		 */

		// 1~100���� ���� �������?
		int f;
		
		//BigInteger : �ڹٿ��� ��� ������ ���� ������ �� �ִ� ������ �ڷ���
		BigInteger aa = new BigInteger("1"); //�հ迡 ����� �ڷ��� ���� 1�� ���ʰ����� ���� ��, ""�� ������ ����
		for (f = 1; f < 10; f++) {
			//multiply : ���ϱ�
			//add : ���ϱ�
			//subtract : ����
			//divide : ������
			aa = aa.multiply(BigInteger.valueOf(f));
		}
		System.out.println(aa);
	}

}
