import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class client {
	
	public static void main(String[] args) {
		
		String ip = "192.168.1.151";
		int port = 9010;
		String msg = "";
		OutputStream os = null;
		InputStream is = null;
		Scanner sn = new Scanner(System.in);
		Socket sc = null;
			try {
				sc = new Socket(ip,port);
				System.out.println("서버 접속 되었습니다");
				 os = sc.getOutputStream();
				 is = sc.getInputStream();
				
				while(true) {	//지속적으로 소켓에 계속 접속되도록 하는 형태
				System.out.println("입력하실 내용을 적어주세요");
				msg = "홍길동 : "+sn.nextLine().intern();
				os.write(msg.getBytes());
				
				byte data[] = new byte[1024];
				int n = is.read(data);
				String cmsg = new String(data,0,n);
				System.out.println(cmsg);
				
				os.flush();
				
//				sc.close();
//				sn.close();
				}
			} catch (Exception e) {
				if(e.getMessage()!=null) {
					sn.close();	
					System.out.println("접속장애 발생");
				}
			}
			finally {	//클라이언트가 접속 종료시 해당 소캣 및 각종 스트림,스캐너 종료
				try {
					os.close();
					is.close();
					sc.close();
					System.out.println("종료");
				} catch (Exception e2) {
					
				}
			}
			
			
			
		
	}
}
