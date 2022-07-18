import java.util.ArrayList;
import java.util.Scanner;

public class test extends ab{
	
	test(){
		choice();
	}
	@Override
	public void choice() {
		Scanner sc = new Scanner(System.in);
		System.out.println("1: 사과 2: 딸기 3: 키위");
		int a = sc.nextInt();
		System.out.println("구매 갯수 입력");
		int b = sc.nextInt();
		
		cal(a,b);
		
	}
	
	@Override
	public void cal(int a, int b) {
		try {
			String[] list = {"사과=1000","딸기=1000","키위=1000"};
			String [] tmp = list[a-1].split("=");
			System.out.println("총 금액은 " + Integer.parseInt(tmp[1])*b + "입니다");
		} catch (Exception e) {
			System.out.println("숫자를 정확히 입력해주세요");
			choice();
		}
		
		
	}
	public static void main(String[] args) {
		test t = new test();
	}
	
}

abstract class ab{
	public abstract void choice();
	public abstract void cal(int a, int b);
}