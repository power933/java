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
			
				
			System.out.println("채팅에 사용하실 아이디를 입력해 주세요");
			String id = scan.nextLine().intern();
			os.write(id.getBytes());
			
			System.out.println("내용을 입력해 주세요");
			String chat = scan.nextLine().intern();
			os.write(chat.getBytes());
			
			String s_msg = new String(b,0,a);	//서버 메세지 받
			System.out.println(sid + " : " + s_msg);
			
			System.out.println("내용을 입력해 주세요");
			chat = scan.nextLine().intern();
			os.write(chat.getBytes());
			
			if(chat=="exit") {
				System.out.println("채팅이 종료되었습니다");
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
