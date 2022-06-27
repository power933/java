import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.Arrays;

//Stream을 이용한 file로드
public class file11 {

	public static void main(String[] args) throws IOException {
		

		try {
			InputStream fs = new FileInputStream("C:\\java5\\File_Stream\\src\\list.txt");
			System.out.println(fs.available());	//파일 전체 크기
			byte[] temp = new byte[fs.available()];
			String data = new String(temp);
			System.out.println(data);
			
//			byte[] temp = new byte[100]; // 1024*16으로 해당 이미지 크기를 설정할 수 있음
//			int ea = fs.read(temp);		//ASCII 코드로 전체를 읽어서 ea에 받도록
//			String data = new String(temp);
////			String data = new String(temp);  - String(temp,"UTF8")로 변환 가능
//			System.out.println(data);
			
			
		} catch (Exception e) {
			
			
		}

	}

}
