import java.util.Arrays;

public class Method8 {

	public static void main(String[] args) {
		/*
		 * ���빮�� ���� ���α׷��Ӱ� �ش� DB�� �� �� Ȧ������ ���� �� ������ �ް��� �մϴ�. 
		 * �ش� ������ ��� �� �� �ֵ��� �ڵ带 �ۼ��Ͻÿ�
		 */
		odbc od = new odbc();
		System.out.println(od.res());

	}

}

class odbc {
	
	private int[] odata; //�迭���� ������� �ʵ��� ���
//	private int tmp = 0;  -> Ȧ���ϰ�� ī����
	
	public odbc() {
	 int[] odata1 = { 15, 22, 17, 14, 32, 35, 19, 33 };
		this.odata = odata1;
	}
	

	public int res() {
		
		int sum = 0;
		for (int i = 0; i < this.odata.length; i++) {
			if (this.odata[i] % 2 == 1) {
				sum +=1;
			}
		}
		return sum;
	}

}