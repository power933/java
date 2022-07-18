import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class chat_client {
	public static void main(String[] args) {
		
		try {
			client_chat cc = new client_chat();
			cc.chat();
		} catch (Exception e) {
			if(e.getMessage() != null) {
				System.out.println(e);
			}
			
		}
	}
}

class client_chat{
	private final String ip = "127.0.0.1";
	int port = 8009;
	Scanner sc = null;
	InputStream is = null;
	OutputStream os = null;
	private String mid = null;
	Socket sk = null;
	String msg = null;
	String smsg = null;
	
	public void chat() {
		// 각종 Stream을 close하지 않습니다. 모든 Stream이 소켓과 연결이 되어 있으므로 
		//close시 소켓도 함께 종료가 됩니다.
		
		try {
			this.sc = new Scanner(System.in);
			System.out.println("아이디를 생성해 주세요");
			this.mid = this.sc.next();
			this.sk = new Socket(ip, port);
			this.is = this.sk.getInputStream();
			this.os = this.sk.getOutputStream();
			this.msg = "["+this.mid+"] 님 입장하였습니다" ;
			this.os.write(this.msg.getBytes());
			this.os.flush();
			this.sc = new Scanner(System.in);
			byte data[] = new byte[1024];
			
			boolean b = true;
			while(b) {
				
				System.out.println("내용을 입력해 주세요");
				String tmp = this.sc.nextLine().intern();
				this.msg = "["+this.mid+"]:" + tmp;
				this.os.write(this.msg.getBytes());
				this.os.flush();
				if(tmp=="exit") {
					System.out.println("채팅이 종료되었습니다");
					break;
				}
				
				int n = this.is.read(data);
				this.smsg = new String(data,0,n);
				System.out.println(this.smsg);
				
			}
			sc.close();
			os.close();
			is.close();
			sk.close();
			
		} catch (Exception e) {
			
		}
	}
}






