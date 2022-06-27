import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;

public class file2 {

	public static void main(String[] args) throws IOException{
		
		
		try {
//			FileReader fr = new FileReader("C:\\java5\\File_Stream\\src\\list.txt");	//8번대 방식
			//Charname.forName : JAVA12 -> EUCKR(ANSI),UTF-8,UTF16
			FileReader fr = new FileReader("C:\\java5\\File_Stream\\src\\list.txt",Charset.forName("EUCKR"));
//			System.out.println(fr.getEncoding());	//인코더 형식을 확인
			
			int w = 0;
			while(true) {	//loop 돌려서 해당 파일 모든 문자를 가져옴
				int m = fr.read();	// -1 : 내용이 없음(더 이상 문자가 없을 경우)
				System.out.print((char)m);
				if(m ==-1)	//더 이상 가져올 문자가 없을 경우 loop빠져나옴
					break;
				w++;
			}
		}
		catch(IOException e) {
			if(e.getMessage() !=null) {
				System.out.println(e);
			}
		}
		
	}

}
