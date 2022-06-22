import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class file8 {

	public static void main(String[] args) throws IOException {
		
		/*
		 * list는 최상위 배열 클래스
		 * files : 신규 IO 클래스. readAllLines(전체 내용을 한번에 모두 읽음)
		 * files + paths.get(경로)
		 */
		
		List<String> data = Files.readAllLines(Paths.get("C:\\java5\\File_Stream\\src\\Buffer.txt"));
		System.out.println(data);
		
		//단점 : 메모리할당 많아짐, 한글 언어패킷을 조정해야함
		byte[] data2 = Files.readAllBytes(Paths.get("C:\\java5\\File_Stream\\src\\Buffer.txt"));
		System.out.println(new String(data2));
	}

}
