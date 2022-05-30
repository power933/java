import java.lang.reflect.Array;
import java.util.Arrays;

public class Array2 {

	public static void main(String[] args) {

		String[] id = { "hong", "kim", "park", "lee", "jang", "jung" };
		/*
		 * 해당 사용자 배열이 있습니다 해당 배열값중 사용자 id 3단어 이상만 출력시키시오
		 */

		for (int i = 0; i < id.length; i++) {
			if (id[i].length() > 3) {
//				System.out.println(id[i]);
			}
		}
//		15 60 10 14 27
//		다음 데이터 값을 모두 더해서 최종 결과값을 출력

		int[] num = { 15, 60, 11, 14, 27 };
		int total = 0;
		for (int j = 0; j < num.length; j++) {
			total += num[j];
		}
		System.out.println(total);

	}
}
