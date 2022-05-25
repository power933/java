import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("첫번째 숫자값을 입력하세요");
		int x = sc.nextInt();
		
		Scanner sc1 = new Scanner(System.in);
		System.out.println("두번째 숫자값을 입력하세요");
		int y = sc1.nextInt();
		
		int z = x*y;
		
		if(z <= 100) {
			System.out.println("100이하의 결과입니다");
		}
		else {
			System.out.println("100초과입니다");
		}
		/*사용자가 입력하여
		 * 조건에 맞는 메세지를 출력하시오
		 * 첫번째 숫자값 * 두 번째 숫자값에 대한 결과를 출력
		 * 단 해당 결과가 15 
		 */
	}

}
