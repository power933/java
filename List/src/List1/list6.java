package List1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class list6 {

	public static void main(String[] args) {
		//문자와 숫자 배열사용, object로 받아서 숫자 혹은 문자만 긁어오기(object + try catch)
		
		Scanner sc = new Scanner(System.in);
		ArrayList list = new ArrayList();
		String xx[] = new String[3];
		int sum1 = 0;
		int w = 0;
		while (w<5) {
			System.out.println("데이터를 입력해 주시길 바랍니다.");
			String user = sc.next();
			list.add(user);
			
			w++;
		}
		int ww=0;
		do {
			try {
				sum1 += Integer.parseInt(String.valueOf(list.get(ww)));	//object -> String -> integer 로 반환
			}catch(Exception e) {	//배열 object가 숫자가 아닐 경우
				xx[ww] = String.valueOf(list.get(ww));
				
			}
			ww++;
		}while(ww<list.size());
		System.out.println(sum1);
		System.out.println(list);
		Object a = list.get(0);
		Object b = list.get(1);
		System.out.println(Arrays.toString(xx));
		
	}

}
