package swing1;

import java.util.*;

public class Prac {

	public String[] solution(int n, int[] arr1, int[] arr2) {
		String[] ar1 = new String[arr1.length];
		String[] ar2 = new String[arr2.length];
		int[] ar3 = new int[arr1.length];
		String[] ar4 = new String[arr1.length];
		
		
		
		for(int i = 0; i<arr1.length;i++) {
			ar1[i] = Integer.toBinaryString(arr1[i]);
			ar2[i] = Integer.toBinaryString(arr2[i]);
			ar3[i] = Integer.parseInt(ar1[i]) + Integer.parseInt(ar2[i]);
			ar4[i] = String.valueOf(ar3[i]);
			ar4[i] = ar4[i].replace("1", "#");
			ar4[i] = ar4[i].replace("2", "#");
			ar4[i] = ar4[i].replace("0", " ");
		}
		System.out.println(Arrays.toString(ar4));
		
		
        
        return ar4;
    }
	
	
	//0 1 2 3 4 5	4 321	4 3 2 1	4
	
	public static void main(String[] args) {
		int arr1[] = {9, 20, 28, 18, 11};
		int arr2[] = {30, 1, 21, 17, 28};
		Prac p = new Prac();
		System.out.println(Arrays.toString(p.solution(5, arr1, arr2)));
		
	}

}
