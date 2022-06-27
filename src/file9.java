import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

//Reader(최상위) - (하위) BufferReader, FileReader, CharArrayReader - 문서파일


public class file9 {

	public static void main(String[] args) {
		//Stream : 이미지 동영상 오디오 같은 파일을 로드하기 위해서
		//inputStream  : 모든 입력장치에 대한 값을 받는 클래스 기본(int)-ASCII
		//inputStream (최상위 입력장치)
		// (하위) FileInputStream, AudioInputStream, ObjectInputStream
		// (하위) InputStreamReader 
		
		InputStream is = new InputStream() {	//기본 클래스를 로드하여 오버라이드 메소드를 불러옴
			@Override
			public int read() throws IOException {	//byte 1~2
				
				return 0;
			}
		};
		//InputStreamReader(언어패킷 변경)	- FileInputStream
		//InputStreamReader("파일명","UTF8")
		InputStreamReader ir = new InputStreamReader(is,Charset.forName("UTF8"));
		try {
			System.out.println(is.read());
			is.read();
		}
		catch (Exception e) {
			System.out.println(e);
		}
		
		
		InputStream user = System.in;
		try {
			int code = user.read();	//키보드 입력 ASCII 코드값을 반환
			if(code == 13) {
				System.out.println("엔터키는 사용하실 수 없습니다.");
			}
			System.out.println(code);
		}
		catch (Exception e) {
			
		}
		
	}

}
