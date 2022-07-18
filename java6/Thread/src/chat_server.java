import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

//server�� �������� ��Ʈ�� ����
public class chat_server {
	public static void main(String[] args) {
		// server 8001,8002  client 8001 �ϳ�, 8002 �ϳ�
		// server 8003, client 8003���� ���
		
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
			Socket s = sk.accept();		//�ش� ��Ʈ ��� ����
			
			is = s.getInputStream();
			os = s.getOutputStream();
			
			// Ŭ�󿡼� �޴� �޼���
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



