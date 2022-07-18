import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

//8002
public class chat_client2 {
	public static void main(String[] args) {

		port_chat2 pc = new port_chat2();
		pc.connect();

	}
}

class port_chat2 {
	String ip = "127.0.0.1";
	int port = 8002;
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
				this.msg = "클라이언트" + port;
				this.os.write(msg.getBytes());
				this.os.flush();
			}
		} catch (Exception e) {

		}
	}

}