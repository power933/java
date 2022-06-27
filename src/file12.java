import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

//fileoutputstream
public class file12 {

	public static void main(String[] args) throws IOException{
		
		String test = "연습입니다 \n";
		OutputStream os = new FileOutputStream("C:\\java5\\File_Stream\\src\\array.txt",true);
		byte[] data = test.getBytes();	//문자 ->ASCII변환
		os.write(data);
		os.flush(); 	//stream에 저장된 모든 값이 메모리에 있게 됩니다.
						//flush() 메모리값을 모두 지우는 작업을 하게됩니다.
		
		
		
	}

}
