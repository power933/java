import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

//scanner�� �̿��� ���� �ε� ����
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
		String result = sc.nextLine();	//���Ϸε� �� �Է°��� result�� ����
		System.out.println(result);		//���
		}
		}
		catch (Exception e) {
			System.out.println(e);
		}
		
	}

}
