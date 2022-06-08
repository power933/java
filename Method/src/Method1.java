import java.util.Arrays;
import java.util.Scanner;

public class Method1 {

	public static void main(String[] args) {
		
		test t = new test();
//		t.a1++;
//		t.a2++;
		t.name1();
		test tt = new test();
//		tt.a1++;
//		tt.a2++;
		tt.name1();
		
		
//		t.b1 += "유관순";
//		t.b2 += "유관순";
		t.name2();
		
//		tt.b1 += "강감찬";
//		tt.b2 += "강감찬";
		tt.name2();
		
		
		Scanner sc = new Scanner(System.in);
		for(int i = 0;i<5;i++) {
			System.out.println("input");
			String ab = sc.next();
			t.te(ab, i);
		}
		System.out.println(Arrays.toString(t.a3));

	}

}

class test{
	
	int a1 = 1; //새로운 객체 생성 및 클래스를 호출 시 1이라는 숫자를 다시 가지게 됩니다.
	//동적변수
	static int a2 =1; //새로운 객체 생성 및 클래스를 호출 하더라도 1이라는 숫자가 아닌 메모리에 등록된 최종값을 지속적으로 가지게 됨
	//정적변수
	
	String b1 = "이순신";
	public static String b2 = "홍길동";
	String[] a3 = new String[5];
	
	public void name1() {
//		System.out.println(a1);
//		System.out.println(a2);
	} 
	public void name2() {
		System.out.println(b1);
		System.out.println(b2);
		
	}
	
	public void te(String a, int in) {
		
			a3[in] = a;
		
	}
	
	
	
}