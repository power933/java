import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Scanner;

public class m_server {

	public static void main(String[] args) {
		chatroom cr = new chatroom();

	}

}

class chatroom {
	ServerSocket server = null;
	static int port = 9009;		//thread ���� �������� ����ϱ� ����
	Socket sk = null;
	
	public chatroom() {
		try {
			this.server = new ServerSocket(this.port);
			
		} catch (Exception e) {
			System.out.println(e);
		}
		System.out.println("****��Ƽ ä�� ����****");
		
		while(true) {
			try {
				sk = this.server.accept();
				chat_thread ct = new chat_thread(sk);	//accept ������ ����
				Thread t = new Thread(ct);
				t.start();
			} catch (Exception e) {
				System.out.println(e);
			}
		}
	}
	
}

class chat_thread implements Runnable{
	Socket sk = null;
	InputStream is  = null;
	OutputStream os = null;
	String message = null;
	String result = null;
	static ArrayList<Socket> user = new ArrayList<>();
	//�迭�� �޸𸮿� ��� ��Ŵ. �������Ѿ���
	//������ �߻��� �����尡 ���Ӱ� �����ǹǷ� �޸𸮿� �ø��� ������ �������� ��� �ʱ�ȭ��
	
	public chat_thread(Socket s) {
		this.sk = s;
		user.add(sk);
		try {
			System.out.println("ä�ÿ� ���� �ϼ̽��ϴ�.");
			System.out.println(user.size());
			this.is = this.sk.getInputStream();
			this.os = this.sk.getOutputStream();
			
			
			
		} catch (Exception e) {
			System.out.println("Ŭ���̾�Ʈ ���� ������ �ùٸ��� �ʽ��ϴ�");
		}
	}
	
	@Override
	public void run() {
		try {
			byte data[] = new byte[1024];
			while (true) {
				
				int n = is.read(data);
				this.message = new String(data,0,n);
				
				//�迭�� �ִ� vport�� ���� ������ ���� �� ��ŭ �ݺ��� �մϴ�
				for(int i = 0 ; i<user.size();i++) {
					//�迭�� �ִ� ����� vport�� ������ �ϰ� �˴ϴ�.
					OutputStream all = user.get(i).getOutputStream();
					//����ں��� Stream�� ����
					all.write(this.message.getBytes());	//����
					all.flush();	//�ش� ���� �޼����� ���
				}
			}
			
		} catch (Exception e) {
			System.out.println("Ŭ���̾�Ʈ�� ����Ǿ����ϴ�.");
			System.out.println(sk);
		}
		finally {
			try {
				this.is.close();
				this.os.close();
				this.sk.close();
				
			} catch (Exception e2) {}
		}
	}
}