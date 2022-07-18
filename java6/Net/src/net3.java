import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.WriteAbortedException;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.Charset;

//crawling ���
public class net3 {

	public static void main(String[] args) throws IOException {
		
		String url = "https://webmail.lh.or.kr/login";
		URL urls = new URL(url);
		System.out.println(urls.getProtocol());	//�������� http?https?
		System.out.println(urls.getPort());		//��Ʈ��ȣ
		System.out.println(urls.getFile());		//���� ���ϸ�
		URLConnection con = urls.openConnection();
		FileWriter fw = new FileWriter(url);
		
		
		InputStream is = urls.openStream();
		InputStreamReader isr = new InputStreamReader(is,"UTF8");
		BufferedReader br = new BufferedReader(isr);
		FileWriter fs = new FileWriter("src/login.txt");
		PrintWriter pw = new PrintWriter(fs);
		String str ="";
		byte b[] = new byte[1024];
		while((str=br.readLine())!=null) {
			System.out.println(str);
			pw.write(str);
		}
		br.close();
		fs.flush();
		fs.close();
		
		
	}

}
