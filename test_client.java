import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class test_client {
	
	
	public static void main(String[] args) {
		
		String ip = "192.168.1.151";
		int port = 9119;
		String msg = "";
		Socket sc = null;
		InputStream is = null;
		OutputStream os = null;
		Scanner scan = new Scanner(System.in);
		
		try {
			sc = new Socket(ip,port);
			while(true) {
				System.out.println("in");
			os = sc.getOutputStream();
			is = sc.getInputStream();
			
			byte[] b = new byte[1024];
			int a = is.read(b);
			String sid = new String(b,0,a);
			
				
			System.out.println("ä�ÿ� ����Ͻ� ���̵� �Է��� �ּ���");
			String id = scan.nextLine().intern();
			os.write(id.getBytes());
			
			System.out.println("������ �Է��� �ּ���");
			String chat = scan.nextLine().intern();
			os.write(chat.getBytes());
			
			String s_msg = new String(b,0,a);	//���� �޼��� ��
			System.out.println(sid + " : " + s_msg);
			
			System.out.println("������ �Է��� �ּ���");
			chat = scan.nextLine().intern();
			os.write(chat.getBytes());
			
			if(chat=="exit") {
				System.out.println("ä���� ����Ǿ����ϴ�");
				System.exit(0);
				is.close();
				os.close();
				sc.close();
			}
			
			}
			
		} catch (Exception e) {
			
			
		}
	}
}
