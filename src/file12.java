import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

//fileoutputstream
public class file12 {

	public static void main(String[] args) throws IOException{
		
		String test = "�����Դϴ� \n";
		OutputStream os = new FileOutputStream("C:\\java5\\File_Stream\\src\\array.txt",true);
		byte[] data = test.getBytes();	//���� ->ASCII��ȯ
		os.write(data);
		os.flush(); 	//stream�� ����� ��� ���� �޸𸮿� �ְ� �˴ϴ�.
						//flush() �޸𸮰��� ��� ����� �۾��� �ϰԵ˴ϴ�.
		
		
		
	}

}
