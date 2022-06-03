import java.util.Arrays;

public class Example2 {

	public static void main(String[] args) {
		/*
		 * 배열 + 기본 메소드 문제 product : 수박 참외 사과 배 딸기 키위 바나나 망고 중 참외 배 키위를 삭제하였습니다 해당 삭제 후
		 * 배열을 다시 재리스트 하는 코드를 작성하시오 단 해당 처리사항은 모두 별도의 메소드에서 처리가 되어야 하며 반복문은 마음대로
		 */

		String arr[] = { "수박", "참외", "사과", "배", "딸기", "키위", "바나나", "망고" };
		Example2 ex = new Example2();
		ex.list(arr);
	}

	public void list(String[] list) {
		int count = 0;
		String[] tmp = new String[list.length];
		for (int i = 0; i < list.length; i++) {
			if (!(list[i].equals("참외") || list[i].equals("키위") || list[i].equals("배"))) {
				tmp[count] = list[i];
				count++;
			}
		}
		String result[] = new String[count];
		for (int j = 0; j < result.length; j++) {
			result[j] = tmp[j];
		}

		System.out.println(Arrays.toString(result));
	}

}
