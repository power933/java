import java.util.Arrays;

public class Example3 {

	public static void main(String[] args) {

		/*
		 * 배열 + 기본 메소드 문제 product : 수박, 참외 사과 배 딸기 키위 바나나 망고 money : 35000 8000 4000
		 * 5500 3800 4400 11000 18900 장바구니에 해당 상품을 담았습니다 단 그 중 사과와 바나나는 제외하고 총 결제금액을
		 * 출력하시오
		 */

		String arr[][] = { { "수박", "참외", "사과", "배", "딸기", "키위", "바나나", "망고" },
				{ "35000", "8000", "4000", "5500", "3800", "4400", "11000", "18900" } };
		Example3 ex = new Example3();
		ex.list(arr);

	}

	public void list(String arr1[][]) {
		String arrlist[][] = new String[arr1.length][arr1[0].length];
		int sum = 0;
		int count = 0;
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr1[i].length; j++) {

				if (i == 0 && !(arr1[i][j].equals("사과") || arr1[i][j].equals("바나나"))) {
					arrlist[i][count] = arr1[i][j];
					arrlist[1][count] = arr1[1][j];
					sum += Integer.parseInt(arrlist[1][count]);
					count++;
				}

			}
		}

		System.out.println(Arrays.deepToString(arrlist));
		System.out.println(sum);
	}
}

//