import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class sserver {
	Scanner sc = null;
	InputStream is = null;
	OutputStream os = null;
	byte data[] = null;
	String mid = null;
	ServerSocket server_socket;
	int port = 9090;
	String message = "";
		
	public void qwe() {
		
		try {
			server_socket = new ServerSocket(port);
			sc = new Scanner(System.in);
			System.out.println("아이디를 입력해 주세요");
			mid = sc.nextLine();	//담당자 아이디
			System.out.println("채팅 대기 중입니다...");
			
			while(true) {
				
				Socket sk = server_socket.accept();
				is = sk.getInputStream();
				BufferedReader br = new BufferedReader(new InputStreamReader(is));
				os = sk.getOutputStream();
				PrintWriter pw = new PrintWriter(os,true);
				
				System.out.println("내용을 입력해 주세요");
				String msg = sc.nextLine();
				pw.println(msg);
				
				message = br.readLine();
				System.out.println(message);
				
				
				
				if(!(message.equals("exit"))) {
					continue;
					
					}
				else {
					System.out.println("나감");
					os.close();
					is.close();
					sk.close();
					
				}
			}
			
		} catch (IOException e) {
			
		}
		
	}
	
	public static void main(String[] args) {
		
		sserver s = new sserver();
		s.qwe();
		
	}
}
