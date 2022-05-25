import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int mon = 100000;
		System.out.println("입금은 1번 출금은 2번");
		int input = sc.nextInt();
		
		
		if(input == 1) {
			System.out.println("입금 금액을 입력하세요");
			int inmon= sc.nextInt();
			mon = mon + inmon;
			System.out.println(mon);
		}
		else {
			System.out.println("출금 금액을 입력하세요");
			int outmon = sc.nextInt();
			if(outmon>mon) {
				System.out.println("보유액보다 적은 금액을 입력하세요");
			}
			else {
			mon = mon - outmon;
			System.out.println(mon);
			}
		}
		
	}

}

/*
 * 고객이 자신의 통장에서 입,출금을 하는 프로세스를 제작해야 합니다.
 * 고객의 기본 자산금액 : 100000
 * 1번 입력시 입금, 2번 입력시 출금 입니다.
 * 1번 입력시 "해당 금액을 입력하세요"
 * 사용자가 입력한 금액 + 기본 자산금액을 합한 총 자산금액
 * 
 * 2번을 입력시 "출금할 금액을 입력하세요"
 * 사용자가 입력한 금액 - 기본 자산금액을 계산하여
 * 총 자산금액을 출력.
 * */
 