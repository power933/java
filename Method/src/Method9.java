import java.util.Arrays;

public class Method9 {

	public static void main(String[] args) {
		
		/*
		 	관리자에서 메뉴를 활성화 하는 프로세서 입니다
		 	해당 메뉴 활성화는 2차 배열이며 메뉴명 활성화는 (Y/N) 구분합니다.
		 	해당 활성화 값을 대입하여 Y로 적용되는 인덱스 번호에 맞는 메뉴명을 1차 배열로 재구성 후
		 	메인에서 출력되도록 합니다
		 	결과 : ["로켓배송","로켓프레시","",]
		 */
		
		menus me = new menus();
		System.out.println(Arrays.toString(me.list()));
		
	}

}

class menus{
	private String ms1[][];
	
	public menus() {
		String ms[][] = {
				{"로켓배송","로켓프레시","쿠팡비즈","골드박스","이벤트","설날","추석"},
				{"Y","Y","N","Y","Y","N","Y"}
		};
		this.ms1 = ms;
	}
	public String[] list() {
		int count = 0;
		String tmp[] = new String[this.ms1[0].length];
		for(int i = 0; i<this.ms1[0].length;i++) {
			if(this.ms1[1][i].equals("Y")) {
				tmp[count] = this.ms1[0][i];
				count++;
			}
		}
		return tmp;
	}
	
	
}

/*
 	class aaa{
 		int a;   -> field
 		String b ;
 			public aaa(){ -> constructor
 			
 			}
 			
 			public void wer(){ -> method
 			
 			}
 	}
  
 */
