package List1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class list3 {

	public static void main(String[] args) {
		
		/*
		 	넘버데이터1 {3,6,9,12,15}
		 	넘버데이터2 {2,4}
		 */
		//Arrays.sort : 배열 변수 형태에만 적용
		Integer test1[]= {3,6,9,12,15};
	 	Integer test2[] = {2,4};
	 	
	 	ArrayList<Integer> t1 = new ArrayList<>(Arrays.asList(test1));
	 	ArrayList<Integer> t2 = new ArrayList<>(Arrays.asList(test2));
	 	
	 	for(int i = 0; i<t2.size();i++) {
	 		t1.add(t2.get(i));
	 	}
	 	System.out.println(t1);
	 	Collections.sort(t1);	//ArrayList, LinkedList sort 오름차순 정렬
	 	System.out.println(t1);
	 	
	 	int ea2 = t1.size();
	 	System.out.println(ea2);
	 	
	 	
	}

}
