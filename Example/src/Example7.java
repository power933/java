import java.util.Arrays;

public class Example7 {

	public static void main(String[] args) {
		
		/*
		 	다차원 배열로 생성 + 외부 class 및 메소드 사용
		 	
		 	[data]
		 	
		 	{"홍길동","합격"},
		 	{"이순신","합격"},
		 	{"강감찬","불합격"},
		 	{"김유신","합격"},
		 	{"유관순","불합격"},
		 	{"장보고","불합격"}
		 	
		 	다차원 배열 형태이며 해당 값중 합격자만 출력되도록 합니다.
		 	단, 배열값을 외부 클래스 안에 메소드에서 처리가 되도록 합니다.
		 	결과 : 홍길동 이순신 김유신
		 */
		
		userlist ul = new userlist();
		ul.re();
		ul = null;
	}

}

class userlist{
	String user_list[][] = {
	{"홍길동","합격"},
 	{"이순신","합격"},
 	{"강감찬","불합격"},
 	{"김유신","합격"},
 	{"유관순","불합격"},
 	{"장보고","불합격"}
	};
	
	public void re() {
		//String tmp[] = new String[user_list.length];
		int count = 0;
		String a = "";
		for(int i = 0;i<user_list.length;i++) {
				if(user_list[i][1].equals("합격")) {
					a += user_list[i][0] + " ";
				}
		}
		String tmp[] = a.split(" ");
		
		for(int i = 0; i<tmp.length;i++) {
			if(tmp[i].equals("이순신")) {
				System.out.println("1");
			}
			else
				System.out.println("2");
		}
		System.out.println(Arrays.toString(tmp));
	}
	
}