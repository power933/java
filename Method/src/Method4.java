import java.util.Arrays;

public class Method4 {

	public static void main(String[] args) {
		//return에 값 2개 사용하기 split
		per p = new per();
		String[] info = p.userinfo().split(" ");
		System.out.println(Arrays.toString(info));
		
		// return에 값 2개 사용하기 배열
		String[] myinfo = p.userinfo2();
		
	}

}

class per{
	public String userinfo() {
		String user_name= "홍길동";
		String user_id="hong";
		String user_info = user_name +" " + user_id;
		return user_info;
	}
	
	public String[] userinfo2() {
		String user_name= "홍길동";
		String user_id="hong";
		return new String[] {user_name,user_id}; // 해당 1개 이상의 값을 리턴으로 보낼 경우.
	}
}