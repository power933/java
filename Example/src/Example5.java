import java.util.Arrays;

public class Example5 {

	public static void main(String[] args) {

		/*
		 	2차배열 + 기본 메소드
		 	등록된 고객중 vip 고객만 리스트를 출력하시오
		 	
		 	user_list : 홍길동 이순신 강감찬 유관순 세종대왕 김유신 계백장군
		 	user_level : gold vip guest gold vip vip guest
		 */
		
		String arr[][] = {{"홍길동","이순신","강감찬","유관순","세종대왕","김유신","계백장군"},
							{"gold","vip","guest","gold","vip","vip","guest"}};
		Example5 ex = new Example5();
		ex.vip(arr);
		
	}
	public void vip(String arr[][]) {
		String tmp[] = new String[arr[1].length];
		int count = 0;
		
		for(int i =0; i<arr.length; i++) {
			for(int j = 0; j<arr[i].length;j++) {
				if(arr[i][j].equals("vip")) {
					tmp[count] = arr[0][j];
					count++;
				}
				
			}
		}
		System.out.println(Arrays.toString(tmp));
	}
}
