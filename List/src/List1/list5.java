package List1;

import java.util.ArrayList;
import java.util.Scanner;

public class list5 {

	public static void main(String[] args) {
		
		/*
		 	사용자가 숫자 금액을 입력합니다.
		 	해당 숫자 금액 횟수는 총 8번 입니다.
		 	0~n 까지 입력.
		 	해당 입력이 모두 끝나면 최종 합계 금액을 출력시키시오.
		 	예시
		 	입금할 금액을 적으세요
		 	500 600 .....
		 */
		
		ArrayList<Integer> li = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		String a;
		for(;;) {
			System.out.println("입금할 금액을 적으세요");
//			int b = sc.nextInt();	숫자 넣어서 돌리면 캐치에서 무한 뺑뺑이돔. 스트링으로 받아서 인트로 바꿔줘야함
			try {
				a = sc.next();
				li.add(Integer.parseInt(a));
				sum += Integer.parseInt(a);
				if(li.size()>7) {
					System.out.println(sum);
					break;
				}
			}
			catch(Exception e){
				System.out.println("숫자만 입력하세요");
			}
		}
	}

}
