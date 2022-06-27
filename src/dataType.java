import java.util.Arrays;

public class dataType {

	public static void main(String[] args) {
		//intern() : equals를 사용하지 않고 == 로 사용 가능
		
		String data[] = {"홍길동"};
		String a = "홍길동";
		String b = "홍길동";
		String c = new String("홍길동").intern();
		String d = new String("홍길동");
		String e = data[0];
		if(c==a) {
//			System.out.println("값이 같습니다");
		}
		
		String x[];
		String z = "123,456";
		x = z.split(",");
		System.out.println(x[0]);
		
	}

}
