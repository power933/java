import java.math.BigInteger;

public class Big_loop {

	public static void main(String[] args) {
		/*
		 * int sum = 0; for (int i = 0; i < 101; i++) { sum += i; }
		 * System.out.println(sum);
		 */

		// 1~100까지 곱한 결과값은?
		int f;
		
		//BigInteger : 자바에서 모든 무한의 값을 저장할 수 있는 유일한 자료형
		BigInteger aa = new BigInteger("1"); //합계에 사용할 자료형 변수 1을 최초값으로 설정 단, ""를 무조건 적용
		for (f = 1; f < 10; f++) {
			//multiply : 곱하기
			//add : 더하기
			//subtract : 뺴기
			//divide : 나누기
			aa = aa.multiply(BigInteger.valueOf(f));
		}
		System.out.println(aa);
	}

}
