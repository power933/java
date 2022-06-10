
public class Example5 {

	public static void main(String[] args) {
		
		/*
		 	extends를 사용하여 다음 결과에 대한 코드를 작성하시오.
		 	숫자 두개를 입력합니다.
		 	두개의 숫자를 확인하여 다음과 같이 체크 합니다.
		 	첫번째 숫자가 두번째 숫자보다 작을 경우
		 	첫번째 숫자가 두번째 숫자보다 클 경우
		 	첫번째 숫자가 두번째 숫자와 같을 경우
		 	
		 	첫번째 숫자가 작을 경우 : 해당 두개의 값을 합친 결과값 출력
		 	두번째 숫자가 작을 경우 : 해당 범위 만큼 숫자를 모두 더한 결과값을 출력
		 	첫번째와 두번째 숫자가 같을 경우 : "해당값이 같습니다" 라고 메세지 출력 
		 */
		int aa = 10;
		int bb = 1;
		ex4 e = new ex4();
		e.ex3_1(aa, bb);
		System.out.println(e.ex4_1());
		System.exit(0);
	}
}

class ex3{
	protected int c,x,y;
	
	public void ex3_1(int a , int b) {
		this.x = a;
		this.y = b;
		if(a == b) {
			this.c = 0;
		}
		else if(a>b) {
			this.c = 1;
		}
		else {
			this.c = 2;
		}
	}
}

class ex4 extends ex3{
	public String ex4_1() {
		int sum = 0;
		String result = "";
		if(this.c == 0) {
			result = "두 값이 같습니다";
		}
		else if(this.c ==1) {
			for(int i = this.y; i<this.x+1;i++) {
				sum += i;
				result = String.valueOf(sum);
		}
		}
		else {
			sum = this.x + this.y;
			result = String.valueOf(sum);
		}
		
		
		return result;
	}
}
