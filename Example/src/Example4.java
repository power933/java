import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Example4 {

	public static void main(String[] args) {
		
		/*
		 	배열생성 + 기본(클래스)메소드 문제
		 	사용자가 다음 질문에 값을 입력하게 됩니다
		 	"학급 학생 이름을 입력해 주세요"
		 	총 배열 데이터는 5개가 생성 되어집니다
		 	별도의 메소드에서 해당 사용자가 입력한 값을 배열로 구성하여 
		 	출력하시오
		 	사용자가 입력한 형태 : hong kim park lee jang
		 	결과 [hong,kim,park,lee,jang]
		 */
		Example4 ex = new Example4();
		Scanner sc = new Scanner(System.in);
		String x = "";
		for(int i =0; i<5;i++) {
			System.out.println("이름을 입력하세요");
			String a = sc.next();
			x += a + ",";
		}
		ex.input(x);
		
	}
	public void input(String a1) {
		String[] a2 = a1.split(" ,");
		System.out.println(Arrays.toString(a2));
	}
}
