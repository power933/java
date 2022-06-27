import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

//scanner를 이용한 파일 로드 사용법
public class file5 {

	public static void main(String[] args) throws IOException {
		
		File f = new File("C:\\java5\\File_Stream\\src\\aaa.txt");
		f.createNewFile();
		//system.in : input
		//system.out : output
		try {
		FileReader fr = new FileReader("C:\\java5\\File_Stream\\src\\db.txt",Charset.forName("UTF8"));
		Scanner sc = new Scanner(fr);
		for(;sc.hasNext();) {
		String result = sc.nextLine();	//파일로드 된 입력값을 result에 전달
		System.out.println(result);		//출력
		}
		}
		catch (Exception e) {
			System.out.println(e);
		}
		
	}

}
