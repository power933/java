package List1;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class List4 {

	public static void main(String[] args) {
		
		Integer a[]= {3,6,9,12,15};
		LinkedList<Integer> ln = new LinkedList<>(Arrays.asList(a));	
		//어레이 리스트보다 좀 느림.  단, 수정시 좀 더 빠름, 게시판 만들땐 어레이, 삭제페이지에선 링크드
		ln.add(33);
		System.out.println(ln);
		
		Scanner sc = new Scanner(System.in);
		String user;
		LinkedList<Integer> list = new LinkedList<>(); //빈배열 생성
		while(true) {
			System.out.println("숫자를 입력 하세요");
			user = sc.next();
			try {	//사용자가 입력한 값을 오류가 있는지 확인하는 파트
				int number = Integer.parseInt(user);
				//입력값이 스트링이 된걸로 왜 달라지지?
				list.add(number);
				int ea = list.size();
				if(ea > 5 ) {	//5개까지 배열이 입력되면 무한루프 종료
					break;
				}
			}
			catch(Exception e) {	//오류가 발생하였을경우 작동하는 코드
				System.out.println("해당 입력사항은 문자입니다  숫자를 입력하세요");
				
			}
			System.out.println(list);
		}
		
	}

}
