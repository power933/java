import java.util.Scanner;

public class Loop_scan1 {

	public static void main(String[] args) {
		//for문 + 스캔
		//원하시는 구구단 숫자 입력하세요
		
		Scanner aa= new Scanner(System.in); // 입력
		System.out.println("원하시는 구구단 숫자 입력하세요");
		int bb = aa.nextInt(); //사용자가 입력한 내용
		int f; //반복문에 사용하는 변수
		int zz; //반복문의 산술연산 결과값
		
		for(f=1;f<=9;f++) {
			zz = bb*f; //산술연산
			System.out.print(zz + " "); //출력
		}
		aa.close(); //종료
		
		
	}

}
