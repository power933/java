package List1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class list1 {

	public static void main(String[] args) {
		
		//add(추가),get(데이터 로드),remove(삭제),size(데이터갯수) : ArrayList라는 util메소드에서 사용하는 부분
		//Arrays.asList : 로드할 배열 변수를 적용
		//중요 : add는 일반적으로 맨 뒤에 데이터가 추가됨 단, index번호를 적용 후 값을 실행하면 
		//해당 인덱스 부분에 추가가 됩니다.
		String member[] = {"이순신","홍길동","유관순","강감찬"};
		ArrayList<String> mb = new ArrayList<>(Arrays.asList(member));
		System.out.println(mb);
		int ea = mb.size();
		System.out.println(ea);
		mb.add("김유신");
		System.out.println(mb);
		mb.remove(1);
		System.out.println(mb);
		mb.add(3,"세종대왕");
		System.out.println(mb);
		String checks = mb.get(2);
		System.out.println(checks);
		
		/*
		 	아래 데이터를 커스텀 하여 다음 결과처럼 출력하시오
		 	[7,15,22,8,11,39,41]
		 */
		//ArrayList에서는 int를 사용하지 않음(integer)를 사용할것
		Integer[] numbers = {15,22,37,8,11,19,41};
		
		ArrayList<Integer> in = new ArrayList<>(Arrays.asList(numbers));
		in.remove(5);
		in.remove(2);
		System.out.println(in);
		in.add(0,7);
		in.add(5,39);
		System.out.println(in);
		
		
	}

}
