import java.io.FileWriter;
import java.io.IOException;

public class file4 {

	public static void main(String[] args) throws Exception {
		
		try {
//			FileWriter : ���� �����͸� ���Ͽ� ���� class
			String user[] = {"������","���ö�","�����","�帣�� ���ϰ�"};
//			FileWriter fw = new FileWriter("C:\\java5\\File_Stream\\src\\array.txt");	
			FileWriter fw = new FileWriter("C:\\java5\\File_Stream\\src\\array.txt",true);
//			Ʈ�� ������ ���������� �� ������ ���� �ۼ���
			for(int i =0;i<user.length;i++) {
				fw.write(user[i]);	//write : ����,�迭 ������ ���� ���Ͽ� ������
			}
			fw.close();		//filewriter�� Ŭ���� ��� �����.
		}
		catch(Exception e) {
			System.out.println("test");
		}
	}

}
