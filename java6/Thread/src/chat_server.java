import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

//server에 여러개의 포트를 오픈
public class chat_server {
	public static void main(String[] args) {
		// server 8001,8002  client 8001 하나, 8002 하나
		// server 8003, client 8003으로 모두
		
		int port[] = {8001,8002};
		openchat oc = null;
		for(int i = 0;i<port.length;i++) {
			oc = new openchat(port[i]);
			oc.start();
		}
	}
}

class openchat extends Thread{
	
	String ip = "127.0.0.1";
	int pt = 0;
	ServerSocket sk = null;
	InputStream is = null;
	OutputStream os = null;
	
	public openchat(int p) {
		this.pt = p;
	}
	
	@Override
	public void run() {
		try {
			sk = new ServerSocket(pt);
			while(true) {
			Socket s = sk.accept();		//해당 포트 모두 오픈
			
			is = s.getInputStream();
			os = s.getOutputStream();
			
			// 클라에서 받는 메세지
			byte[] data = new byte[1024];
			int n = is.read(data);
			String message = new String(data,0,n);
			System.out.println(message);
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}



