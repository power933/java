
public class Method2 {

	public static void main(String[] args) {
		//default package를 사용 시 해당 클래스명을 호출하면 됨 
		// 단 package로 묶여있을 경우 제일 상단에 package를 선언해야함
//		test ts = new test();
//		ts.a2++;
//		System.out.println(ts.a2);
		
		info i = new info();
//		System.out.println(i.data2(20)); -> error
		System.out.println(i.data3(20));
		
		String result = i.data4("홍길동");
		System.out.println(result);
	}

}

class info{
	int a;
	public static void data1(int abc) {
		int z = abc + 20;
//		return z;
	}
	public void data2(int abc) {
		int z = abc + 20;
//		return z;
	}
	
	public int data3(int abc) {
		int z = abc + 20;
		return z;
	}
	
	public String data4(String abc) {
		String z = abc + "님 환영합니다";
		return z;
		
	}
}