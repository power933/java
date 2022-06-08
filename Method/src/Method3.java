
public class Method3 {

	public static void main(String[] args) {
		/*
		 	응용문제. 인수값 2개의 숫자를 적용하여 계산되도록 합니다.
		 	최종 계산을 받아서 결과를 출력하시오
		 	157,45
		 	157*45
		 	최종 결과값 출력 : 
		 */
		cal ca = new cal();
		System.out.println(ca.mul(157, 45));
		ca.m2();
		ca.mul();
		
		/*
		 	다음 숫자 하나를 해당 메소드로 전달 하게 됩니다.
		 	해당 메소드에서는 다음과 같이 처리 합니다.
		 	숫자 3을 전달하면 3*1~3*9까지의 모든 결과값을 더하여
		 	sysout으로 출력되도록 하십시오.
		 */
		ca.m3(3);
	}

}
class cal{
	public int mul(int a, int b) {
		return a*b;
	}
	public void mul() {
		System.out.println("test");
	}
	public void m2() {
		int z = mul(100,200);
		System.out.println(z);
	}
	public int gugu(int a) {
		int sum = 0;
		for(int i = 1; i<10; i++) {
			sum += i * a;
		}
		if(sum>100) {
			return 1;
		}
		return sum;
	}
	public void m3(int a) {
		System.out.println(gugu(a));
	}
	
	public String mb(String mid) {
		String msg;
		if(mid.equals("hong")) {
			msg = "ok";
		}
		else {
			msg = "cancel";
		}
		return msg;
	}
}