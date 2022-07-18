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
	static int port = 9009;		//thread 에서 공용으로 사용하기 위함
	Socket sk = null;
	
	public chatroom() {
		try {
			this.server = new ServerSocket(this.port);
			
		} catch (Exception e) {
			System.out.println(e);
		}
		System.out.println("****멀티 채팅 시작****");
		
		while(true) {
			try {
				sk = this.server.accept();
				chat_thread ct = new chat_thread(sk);	//accept 정보를 보냄
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
	//배열을 메모리에 기억 시킴. 누적시켜야함
	//접속자 발생시 쓰레드가 새롭게 생성되므로 메모리에 올리지 않으면 누적없이 계속 초기화됨
	
	public chat_thread(Socket s) {
		this.sk = s;
		user.add(sk);
		try {
			System.out.println("채팅에 참여 하셨습니다.");
			System.out.println(user.size());
			this.is = this.sk.getInputStream();
			this.os = this.sk.getOutputStream();
			
			
			
		} catch (Exception e) {
			System.out.println("클라이언트 접속 정보가 올바르지 않습니다");
		}
	}
	
	@Override
	public void run() {
		try {
			byte data[] = new byte[1024];
			while (true) {
				
				int n = is.read(data);
				this.message = new String(data,0,n);
				
				//배열에 있는 vport에 대한 정보를 담은 수 만큼 반복을 합니다
				for(int i = 0 ; i<user.size();i++) {
					//배열에 있는 사용자 vport로 전송을 하게 됩니다.
					OutputStream all = user.get(i).getOutputStream();
					//사용자별로 Stream을 생성
					all.write(this.message.getBytes());	//전송
					all.flush();	//해당 전송 메세지를 비움
				}
			}
			
		} catch (Exception e) {
			System.out.println("클라이언트가 종료되었습니다.");
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