
public class Method6 {
	public static void main(String[] args) {
		insert i = new insert();
		
		i.userid="hong";
		String skey = "a1234567";
		
		String result = i.checks(skey);
		System.out.println(result);

		
	}

}

class insert{
	String userid = null;
	private String key = "a1234567"; //�ش� Ŭ�������� ����Ǵ� key��
	
	public String checks(String bb) {
		
		this.key = bb;
		String msg = "";
		if(key.equals("a1234567")) { //�ش� Ű��(private)�� �ܺ� Ŭ�������� �Ѿ���� �μ����� ��
			if(userid.equals("hong")) {
				msg = "�����͸� Ȯ�� �߿� �ֽ��ϴ�";
			}
			else {
				msg = "�ش� �����Ͱ��� Ȯ������ ���մϴ�";
			}
		}
		else { //�ܺ� Ŭ�������� �ùٸ� Ű���� ���� ���� ���� ���
			msg = "error";
		}
		return msg; // ���� ����� ���� �������� ȸ��
	}
}