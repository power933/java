//������ȣ �߼� �ý��� awt6_abstract
public class awt6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		randomNum rn = new randomNum();
		rn.design();
		
	}

}

class randomNum extends awt6_abstract{
	String random = "";
	int input;
	@Override
	public String mr() {
		random = "";
		for(int i=0;i<4;i++) {
			random+=(int)(Math.random()*10);
		}
		System.out.println(random);
		return this.random;
		
	}
	
	@Override
	public String compare(String a) {
	
		if(a.equals(this.random)) {
			msg = "������ �Ϸ�Ǿ����ϴ�";
		}
		else {
			msg = "������ȣ�� �ٽ� Ȯ�� �Ͻñ� �ٶ��ϴ�";
		}
		return msg;
	
		
	}
}