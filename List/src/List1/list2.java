package List1;

import java.util.ArrayList;
import java.util.Arrays;

public class list2 {

	public static void main(String[] args) {
		
		/*
		 	해당 데이터 값중 휴면고객 데이터는 모두 삭제 해야 합니다.
		 	고객 데이터
		 	{"김수빈","김정현","김창순","박도현","이경훈","정재욱","하윤성"}
		 	결과 정재욱,하윤성
		 */
		String user[] = {"김수빈","김정현","김창순","박도현","이경훈","정재욱","하윤성"};
		ArrayList<String> data = new ArrayList<>(Arrays.asList(user));
		for(int i = 0; i<data.size();i++) {
			for(int j = 0;j<data.size();j++ ) 	//node의 갯수를 다시 파악함
			if(!data.get(j).equals("정재욱") && !data.get(j).equals("하윤성"))  {
				data.remove(j);
				
			}
		}
		System.out.println(data);
		/*
		 	짝수 숫자를 모두 삭제 합니다.
		 	{10,7,6,1,11,37,41,22}
		 */
		Integer x[] = {10,7,6,1,11,37,41,22};
		ArrayList<Integer> x1 = new ArrayList<>(Arrays.asList(x));
		ArrayList<Integer> x2 = new ArrayList<>(Arrays.asList(x));
		for(int i = 0; i<x1.size();i++) { 
			for(int j = 0;j<x1.size();j++) {  
				if(x1.get(j)%2 == 0) {
					x1.remove(j);
				}
			}
		}
		System.out.println(x1);
		
		int w = 0;
		while(w<x2.size()) {
			int ww = 0;
			while(ww<x2.size()) {
				if(x2.get(ww)%2 == 0) {
					x2.remove(ww);
				}
				ww++;
			}
			w++;
		}
		System.out.println(x1);
		
	}

}
