import java.util.Scanner;

public class Scan1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("당신의 나이는? : ");
		int c = sc.nextInt();
		System.out.print("당신의 나이는? : ");
		int d = sc.nextInt();
		
		System.out.println(c+d);
	
		Scanner sc1 = new Scanner(System.in);
		System.out.print("입력하실 금액을 적어주세요 : ");
		
		int e = sc1.nextInt();
		
		if(e<1000) {
			System.out.println("1000원 이상 금액을 적어주세요.");
		}
		else {
			System.out.println("입금이 진행됩니다.");
		}
		
	}

}
