import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class m_client {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("������ ���̵� �Է��� �ּ���");
		String user = sc.nextLine();
		
		chatclient cc = new chatclient(user);
	}
}

class chatclient{
	static final String ip = "127.0.0.1";
	static final int port = 9009;
	Socket sk = null;
	InputStream is = null;
	OutputStream os = null;
	String message = null;
	String result = null;
	public chatclient(String mid) {
		try {
			byte[] data = new byte[1024];
			System.out.println(mid + "�� ���� �ϼ̽��ϴ�");
			this.sk = new Socket(this.ip,this.port);
			this.os = this.sk.getOutputStream();
			this.is = this.sk.getInputStream();
			
			while(true) {
			Scanner sc = new Scanner(System.in);
			System.out.println("�޼��� �Է�");
			result = mid + " : " + sc.nextLine();
			this.os.write(this.result.getBytes());
			this.os.flush();
			
			
			int x = this.is.read(data);
			this.message = new String(data,0,x);
			System.out.println(message);
			}
			
			
		} catch (Exception e) {
			System.out.println("clinet" + e);
		}
	}
}
















