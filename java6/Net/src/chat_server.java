import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class chat_server {
	public static void main(String[] args) {
		chat ch = new chat();
		ch.chatserver();
		
		
				
	}
}


class chat{
	private int port = 8009;
	ServerSocket sk = null;
	Socket so = null;
	Scanner sc = null;
	InputStream is = null;
	OutputStream os = null;
	String mid = null;
	String msg = null;
	String cmsg = null;
	
	public void chatserver() {
		try {
			
			this.sk = new ServerSocket(port);
			this.sc = new Scanner(System.in);
			System.out.println("���̵� �־��ּ���");
			this.mid = sc.next();
			System.out.println("ä�ù� ���� �Ǿ����ϴ�.");
			this.so = sk.accept();
			this.is = so.getInputStream();
			this.os = so.getOutputStream();
			byte data[] = new byte[1024];
			
			int x = this.is.read(data);
			String xx = new String(data,0,x);
			System.out.println(xx);
			boolean b = true;
			this.sc = new Scanner(System.in);
			
			while(b) {
				int n = this.is.read(data);
				this.msg = new String(data,0,n);
				String a[] = msg.split(":");
				if(a[1].equals("exit")) {
					System.out.println(a[0] + "���� �����ϼ̽��ϴ�");
					break;
				}
				else {
					System.out.println(this.msg);
				}
				
				System.out.println("������ �Է����ּ���");
				this.cmsg = "[" + this.mid+"] : "+sc.nextLine();
				this.os.write(this.cmsg.getBytes());
				this.os.flush();
				
			}
			is.close();
			os.close();
			sc.close();
			so.close();
			sk.close();
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}







