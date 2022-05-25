import java.util.Scanner;

public class Scan4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("입력할 내용을 적어주세요");
		String memo = sc.nextLine(); // next는 스페이스바 까지만 입력, nextLine 은 줄 전체를 입력(스페이스포함)
		
		System.out.println(memo);
		
		sc.close(); //스캐너를 종료 안끄면 메모리 먹음
		
		
		
		String name = "park"; //string = %s, $s = 숫자 + string
		double num = 25; // %d = 정수,%f = 실수, %t = date,time %b = boolean
		
		//System.out.println(name + "님의 나이는"+num+"입니다.");
		System.out.printf("%s님의 나이는 %f 입니다", name,num); //printf : f라는 뜻이 format을 뜻함
	}

}
