import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

//8001
public class chat_client {
	public static void main(String[] args) {

		port_chat pc = new port_chat();
		pc.connect();

	}
}

class port_chat {
	String ip = "127.0.0.1";
	int port = 8001;	//�������� ������ ��Ʈ
	InputStream is = null;
	OutputStream os = null;
	String msg = "";
	Socket sc = null;

	public void connect() {
		try {
			this.sc = new Socket(ip, port);
			while (true) {
				this.is = sc.getInputStream();
				this.os = sc.getOutputStream();
				
				//������ �ش� �޼��� ����
				this.msg = "Ŭ���̾�Ʈ" + port;
				this.os.write(msg.getBytes());
				this.os.flush();
				
				
			}

		} catch (Exception e) {

		}
	}

}
