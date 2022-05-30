import java.util.Arrays;
import java.util.Scanner;

import javax.sound.midi.SysexMessage;

public class Array3 {

	public static void main(String[] args) {

		/*
		 * foreach 문을 사용할 때는 인덱스 번호가 필요없이 사용할 경우. for,while 문을 사용할 때는 인덱스 번호가 필요할 떄 사용
		 */
		int[] data = { 5, 10, 15, 20, 25, 30, 35 };
		for (int f : data) { // int f가 순차적으로 data 배열값을 받아서 저장 시킵니다.
//			if(f%2==0)
//			System.out.println(f);
		}

//		String pay[] = { "무통장입금", "신용카드", "휴대폰 결제", "상품권", "쿠폰" };
//		Scanner sc = new Scanner(System.in);
//		System.out.println("결제하고자 하는 형태를 선택해 주세요");
//		String pm = sc.nextLine();
//		for (String z : pay) { // 배열데이터가 문자 이므로 받는 변수 형태 또한 문자형을 사용해야 합니다
//			if (pm.equals(z)) {
//				if (z.equals("휴대폰 결제")) {
//					System.out.println("현재 시스템 점검으로 해당 결제는 사용하실 수 없습니다");
//				} else {
//					System.out.println(pm + "로 결제 진행 됩니다");
//				}
//			System.out.println(pm+"로 결제 진행 됩니다");
//			}
//		}

		/*
		 * {"햄버거","피자","치킨","커피"} "주문하고자 하는 음식을 선택해 주세요." 해당 질문은 총 4번을 물어 보게 됩니다. 단,
		 * "주문종료"라고 사용자가 입력시 그 즉시 주문은 종료되며 주문 내역을 출력하시면 됩니다.
		 */

		String[] food = { "햄버거", "피자", "치킨", "커피" };
		String[] od = new String[food.length];
		Scanner sc = new Scanner(System.in);
		String sel = "";
		int i = 0;
		for (String s : food) {
			System.out.println("주문하고자 하는 음식을 선택해주세요");
			sel = sc.next();
			if (sel.equals("주문종료")) {
				break;
			} else {
					if (sel.equals("햄버거") || sel.equals("피자")||sel.equals("치킨")||sel.equals("커피")) {
						od[i] = sel;
					}else {
						System.out.println("정확히 주문해주세요");
						break;
					}
			}
			i++;
		}
		System.out.println(Arrays.toString(od));

	}

}
