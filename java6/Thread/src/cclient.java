import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class cclient {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("접속할 ip번호 입력");
		String ip = sc.next();
		System.out.println("접속할 port번호 입력");
		int port = sc.nextInt();
		System.out.println("접속할 id 입력");
		String id = sc.next();
		
		chat_cli cc = new chat_cli(ip, port, id);
		
	}
}

class chat_cli{
	String uip = null;
	int uport = 0;
	String uid = null;
	Socket sc = null;
	Scanner scan = null;
	String msg = null;
	public chat_cli(String ip, int port, String id) {
		uip = ip;
		uport = port;
		uid = id;
		try {
			sc = new Socket(uip,uport);
			BufferedReader br = new BufferedReader(new InputStreamReader(sc.getInputStream()));
			PrintWriter pw = new PrintWriter(sc.getOutputStream());
			
//			pw.println(uid);
			scan = new Scanner(System.in);
			while(true) {
				System.out.println("메세지 입력");
				msg = scan.nextLine();
				pw.println(msg);
				pw.flush();
				
				String result = br.readLine();
				System.out.println(result);
			}
			
			
		} catch (Exception e) {
		}
	}
}