import java.util.Scanner;

public class Example1 {

	public static void main(String[] args) {
		
		/* while문으로 코드를 작성.
		사용자가 상품을 전체 선택하였음 상품 총 금액은 70000 입니다.
		첫 번째 질문은 "7000 결제하시겠습니까?"라고 출력되며
		
		 	숫자 1이라고 입력하면 최종결제 금액에 추가 되어 집니다.
		 	단 2라고 입력시 최종결제금액에 추가되어지면 안됩니다.
		 	
		 	총 질문 횟수는 4번 입니다.
		 	마지막에 최종 결제 금액이 나오도록 코드를 작성하시오
		 */
		Scanner sc = new Scanner(System.in);
		int selc = 0;
		int total = 70000;
		int a = 0;
		while(a<4) {
			System.out.println("7000 결제하시겠습니까?");
			selc = sc.nextInt();
			if(selc == 1) {
				total+=7000;
			}
			else if(selc == 2) {
				
			}
			a++;
		}
		
		System.out.println(total);
	}

}
