
public class dataType {

	public static void main(String[] args) {
		//intern() : equals�� ������� �ʰ� == �� ��� ����
		
		String data[] = {"ȫ�浿"};
		String a = "ȫ�浿";
		String b = "ȫ�浿";
		String c = new String("ȫ�浿").intern();
		String d = new String("ȫ�浿");
		String e = data[0];
		if(c==a) {
			System.out.println("���� �����ϴ�");
		}
		
	}

}
