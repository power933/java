import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.util.Arrays;

//OutPutStream (output) - �ֻ���
//(����) FileOutPutStream, ObjectOutPutStream
public class file10 {

	public static void main(String[] args) {
		String a = "1234567890";		//byte[] : ���ڿ��� ascii������ �迭�� �����Ҷ� ���
		byte[] b = a.getBytes();	//getBytes("�����Ŷ") �޼ҵ�
		OutputStream os = System.out;	//���
		

		try {
			os.write(b,0,b.length);
			os.flush();
			
		} catch (Exception e) {
			
		}	
		
	}

}
