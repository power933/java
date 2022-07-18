import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Scanner;

public class cserver {

	public static void main(String[] args) {
		/*	
		 	서버 프로그램을 실행합니다. 실행 가장 먼저 해당 질문을 하게 됨
		 	"사용하실 포트 번호를 입력해주세요" : 9009 (무조건 숫자만 입력받음)
		 	***********채팅서버 오픈[9009]************
		 	
		 	클라이언트 프로그램 실행합니다.
		 	"접속할 ip번호를 입력해주세요" 
		 	"접속할 port번호를 입력해 주세요"
		 	*************
		 	
		 	서버 최종 메세지
		 	"*********** GUEST가 참여 하였습니다 *********
		 */
		
		chat_ser cs = new chat_ser();
		
	}

}

class chat_ser{
	int port = 0;
	public chat_ser() {
		System.out.println("사용하실 포트 번호를 입력해주세요");
		Scanner sc = new Scanner(System.in);
		port =  sc.nextInt();
		try {
			ServerSocket ss = new ServerSocket(port);
			while(true) {
			Socket sk = ss.accept();
			
			chating c = new chating(sk);
			Thread t = new Thread(c);
			t.start();
			}
		} catch (Exception e) {
			
		}
		
	}
	
}

class chating extends Thread{
	Socket sk = null;
	BufferedReader br = null;
	PrintWriter pw = null;
	String msg = null;
	String userid = null;
	ArrayList<Socket> al = new ArrayList<>();
	public chating(Socket sk) {
		this.sk = sk;
		al.add(sk);
		try {
//			br = new BufferedReader(new InputStreamReader(sk.getInputStream()));
//			pw = new PrintWriter(sk.getOutputStream());
			System.out.println(1);
			
			
		} catch (Exception e) {
		}
		
	}
	
	@Override
	public void run() {
		
		try {
			br = new BufferedReader(new InputStreamReader(sk.getInputStream()));
			
			while(true) {
				
				msg = br.readLine();
				for(int i = 0;i<al.size();i++) {
					pw = new PrintWriter(al.get(i).getOutputStream());
					pw.println(msg);
					pw.flush();
				}
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
}




