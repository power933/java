import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.Arrays;

//Stream�� �̿��� file�ε�
public class file11 {

	public static void main(String[] args) throws IOException {
		

		try {
			InputStream fs = new FileInputStream("C:\\java5\\File_Stream\\src\\list.txt");
			System.out.println(fs.available());	//���� ��ü ũ��
			byte[] temp = new byte[fs.available()];
			String data = new String(temp);
			System.out.println(data);
			
//			byte[] temp = new byte[100]; // 1024*16���� �ش� �̹��� ũ�⸦ ������ �� ����
//			int ea = fs.read(temp);		//ASCII �ڵ�� ��ü�� �о ea�� �޵���
//			String data = new String(temp);
////			String data = new String(temp);  - String(temp,"UTF8")�� ��ȯ ����
//			System.out.println(data);
			
			
		} catch (Exception e) {
			
			
		}

	}

}
