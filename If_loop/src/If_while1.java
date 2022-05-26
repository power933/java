
public class If_while1 {

	public static void main(String[] args) {

		// while문으로 10부터 30까지 숫자중 홀수값만 출력

		int a = 10;
		while (a < 31) {
			if (a % 2 == 1 && a > 19) {
				// System.out.print(a + " ");
			}
			a++;
		}

		// 1~10까지 짝수갯수 출력
		int ww = 1;
		int count = 0; //카운터 변수값

		while (ww < 11) {
			if (ww % 2 == 0) { //짝수인 경우
				count++;		//해당 조건이 맞을 경우 +1씩
			}
			ww++;
		}
		//반복문 종료시 최종 결과값 종료시 카운터값을 종료하게 됩니다
		System.out.println(count);

	}

}
