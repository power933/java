package List1;

import java.util.ArrayList;
import java.util.Arrays;

public class list7 {

	public static void main(String[] args) {
		
		/*
		 	ArrayList 또는 링크드 리스트 둘 중에 원하는 메소드를 구현
		 	2차배열 형태
		 	해당 데이터 값을 모두 더하여 짝수 인지 홀수 인지를 확인 하시오.
		 	Integer data[][] = {
		 		{10,20,30,40,50,60,70},
		 		{3,6,9,12,15,17,19}
		 	};
		 	
		 	총 합은 ~ 이고 짝수입니다
		 */
		Integer data[][] = {
		 		{10,20,30,40,50,60,70},
		 		{3,6,9,12,15,17,19}
		 	};
		
		ArrayList<Integer> al = new ArrayList<>();
		int sum = 0;
		String n = "";
		for(int i = 0;i<data.length;i++) {
			for(int j = 0;j<data[i].length;j++) {
				al.add(data[i][j]);
			}
		}
		for(int i = 0; i<al.size();i++) {
			sum += al.get(i);
		}
		if(sum%2 == 0) {
			n = "짝수";
		}
		else {
			n = "홀수";
		}
		System.out.printf("총 합은 %d 이고 %s입니다",sum,n);
	}

}
