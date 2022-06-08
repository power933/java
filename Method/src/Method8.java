import java.util.Arrays;

public class Method8 {

	public static void main(String[] args) {
		/*
		 * 응용문제 협업 프로그래머가 해당 DB에 값 중 홀수값에 대한 총 갯수를 받고자 합니다. 
		 * 해당 갯수를 출력 될 수 있도록 코드를 작성하시오
		 */
		odbc od = new odbc();
		System.out.println(od.res());

	}

}

class odbc {
	
	private int[] odata; //배열값이 변경되지 않도록 사용
//	private int tmp = 0;  -> 홀수일경우 카운팅
	
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