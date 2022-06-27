import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.util.Arrays;

//OutPutStream (output) - 최상위
//(하위) FileOutPutStream, ObjectOutPutStream
public class file10 {

	public static void main(String[] args) {
		String a = "1234567890";		//byte[] : 문자열을 ascii형태의 배열로 변경할때 사용
		byte[] b = a.getBytes();	//getBytes("언어패킷") 메소드
		OutputStream os = System.out;	//출력
		

		try {
			os.write(b,0,b.length);
			os.flush();
			
		} catch (Exception e) {
			
		}	
		
	}

}
