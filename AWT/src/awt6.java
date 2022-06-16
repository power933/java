//인증번호 발송 시스템 awt6_abstract
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
			msg = "인증이 완료되었습니다";
		}
		else {
			msg = "인증번호를 다시 확인 하시길 바랍니다";
		}
		return msg;
	
		
	}
}