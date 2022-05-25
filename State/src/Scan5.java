import java.util.Scanner;

public class Scan5 {

	public static void main(String[] args) {
		
		byte a = 45;
		if(a < 10) {
			System.out.println("입력한 값은 10이하 입니다");
		}
		else if(a >= 10 || a<=22) { 
			System.out.println("당첨");
		}
		else {
			System.out.println("범위밖의 숫자 입니다.");
		}
		//if문 여러개 조건걸때 잘 생각할것(작은 범위부터?)
		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("1~45중 숫자 하나 입력하세요 : ");
		int b = sc.nextInt();
		if(b<=45 && b>=1) {
			if(b == 7 || b==12||b==14) {
				System.out.println("당첨입니다");
			}
			else {
				System.out.println("다음기회에");
			}
		}
		else if(b==0){
			System.out.println("숫자입력이 잘못 되었습니다");
		}
		else if(b>45) {
			System.out.println("숫자는 1~45까지만 입력해주세요.");
		}
		// 가능하면 앞에서 조건 다 쳐버리고 메인을 else로 두면 나중에 수정할때 편함
		
	}

}
