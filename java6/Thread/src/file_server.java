import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class file_server {
	public static void main(String[] args) {
		f_server fs = new f_server();
		fs.data();
		
	}
}

class f_server{
	ServerSocket server = null;
	Socket sk = null;
	int port = 8006;
	InputStream is = null;
	OutputStream os = null;
	
	public void data() {
		try {
			server = new ServerSocket(port);
			sk = server.accept();
			System.out.println("*****����������*****");
			
			is = sk.getInputStream();
			os = sk.getOutputStream();
			
			byte data[] = new byte[1024*16];
			int n = is.read(data);
//			String f = new String(data,0,n);
			String url = "C:\\Users\\tjoeun\\Desktop\\copy.jpg";
			//���Ϸ� Ŭ���̾�Ʈ�� ������ �ϹǷ� �������� byte�� ���� �ް� �˴ϴ�.
			//getInputStream() -> FileOutPutStream
			FileOutputStream fs = new FileOutputStream(url);
			fs.write(data,0,n);
			fs.close();
			
			
//			FileOutputStream fs = new FileOutputStream("C:\\Users\\tjoeun\\Desktop\\1.jpg");
//			BufferedOutputStream bo = new BufferedOutputStream(fs);
			
			
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}









