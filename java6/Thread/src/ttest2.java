import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ttest2 {
	
	public void search(String x) {
		String arr[] = {"강보경", "권용환", "금새록", "김동주", "김민재", "성유리", "손진호", "안희성"};
		ArrayList<String> al = new ArrayList<>(Arrays.asList(arr));
		
		for(int i = 0; i<al.size();i++) {
			if(al.get(i).equals(x)) {
				System.out.println("해당 사용자가 있습니다");
			}
			else {
				System.out.println("해당사용자가 없습니다");
			}
		}
		
	}
	
	public void userinput() {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자 8번 입력");
		int result = 0;
		for(int i = 0; i<8;i++) {
			int tmp = sc.nextInt();
			result += tmp; 
		}
		System.out.println(result);
	} 
	public static void main(String[] args) {
		
		ttest2 t = new ttest2();
		t.userinput();
		Scanner sc1 = new Scanner(System.in);
		String a = sc1.next();
		t.search(a);
		/*
		 [TEST2]
[문제1]
총 8번의 사용자가 숫자를 입력 합니다. 해당 숫자를 입력하는 Scanner은 userinput이라는 메소드 에서 처리를 해야 하며
해당 모든 값에 대한 더한 결과는  result에서 값이 출력 되도록 하는 프로그램을 제작하시오.
힌트 (외부클래스에서 메소드2개 생성)

[문제2]
검색할 사용자 이름을 검색하게 됩니다. (메인 메소드에서 실행)

사용자 리스트는 다음과 같습니다.  (외부 클래스 및 외부 메소드에서 제작)
강보경, 권용환, 금새록, 김동주, 김민재, 성유리, 손진호, 안희성

해당 리스트 정보는 별도의 메소드 에서 생성해야 합니다.
사용자가 입력된 이름이 있을 경우 "해당 사용자가 있습니다." 라고 출력하고
없을 경우 "해당 사용자는 가입 되지 않았습니다." 라고 출력합니다.

힌트 : 메인메소드에서 Scanner 작동 하며, 데이터 검색은 외부 Class 및 외부 메소드에서 처리


		 */
	}
}
