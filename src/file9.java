import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

//Reader(�ֻ���) - (����) BufferReader, FileReader, CharArrayReader - ��������


public class file9 {

	public static void main(String[] args) {
		//Stream : �̹��� ������ ����� ���� ������ �ε��ϱ� ���ؼ�
		//inputStream  : ��� �Է���ġ�� ���� ���� �޴� Ŭ���� �⺻(int)-ASCII
		//inputStream (�ֻ��� �Է���ġ)
		// (����) FileInputStream, AudioInputStream, ObjectInputStream
		// (����) InputStreamReader 
		
		InputStream is = new InputStream() {	//�⺻ Ŭ������ �ε��Ͽ� �������̵� �޼ҵ带 �ҷ���
			@Override
			public int read() throws IOException {	//byte 1~2
				
				return 0;
			}
		};
		//InputStreamReader(�����Ŷ ����)	- FileInputStream
		//InputStreamReader("���ϸ�","UTF8")
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
			int code = user.read();	//Ű���� �Է� ASCII �ڵ尪�� ��ȯ
			if(code == 13) {
				System.out.println("����Ű�� ����Ͻ� �� �����ϴ�.");
			}
			System.out.println(code);
		}
		catch (Exception e) {
			
		}
		
	}

}
