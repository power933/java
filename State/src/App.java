import java.util.Arrays;

public class App {

	public static void main(String[] args) {
		
		int a = 25+31*4+12;
		int b = 15*3+9+14;
				
		if(a>b) {
			System.out.println(b);
		}
		else if(a<b)
			System.out.println(a);
		else
			System.out.println("두 값이 같음");
		
		//해당값을 2진수로 짝수, 홀수로 확인하기
		int c = 11%2; // %가 기호로 사용시 0 또는 1로 나머지 값이 출력이 됩니다.
		System.out.println(c);
		
		if(b%2 == 0) {
			System.out.println("짝수 입니다.");
		}
		else {
			System.out.println("홀수 입니다.");
		}
		int x = 0;
		int arr[] = new int[x];
		for(int i = 0; i<=4;i++) {
			
			System.out.println(Arrays.toString(arr));
		}
		
	}

}
