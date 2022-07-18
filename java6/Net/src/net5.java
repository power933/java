import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

//Socket : Server, client : 메세지,파일 전달 (양방향)

//HTTP통신 : Image, 동영상, 음악 사용자(요청)랑 서버랑 송수신 통신
public class net5 {
	// server
	public static void main(String[] args) {
		System.out.println("Server Connect");
		int port = 8080; // 오픈할 포트번호를 세팅함(단, 절대 중복된 포트를 사용 하면 안됨)
		String msg = "Success Connect!!";

		try {
			ServerSocket ss = new ServerSocket(port); // ServerSocket : 오픈시킬 포트를 적용
			//연결을 지속유지 하기 위해서는 ServerSocket은 절대 재로드 해서는 안됨
			while (true) {
				System.out.println("연결대기중");
				Socket sc = ss.accept(); // accept() : 클라이언트가 들어오는 것을 대기 하는 역할을 하게 함
				System.out.println("호스트:통신 연결 성공");
				// 서버에서 client로 받는 통로
				InputStream is = sc.getInputStream(); // client에서 보내는 값을 읽어들임
				// client로 보내는 통로
				OutputStream os = sc.getOutputStream(); // client로 값을 전송
				byte[] data = new byte[1024]; // client 에서 받는 값을 byte로 받음
				int n = is.read(data); // 해당 값을 읽어들임
				String msgclient = new String(data, 0, n); // 해당값을 배열로 확인 하여 변수 이관
				System.out.println(msgclient); // 이관된 값을 출력시키게 됨

				String aws = "반갑습니다"; // 서버에서 보내는 메세지
				os.write(aws.getBytes()); // client로 보내기 위한 메모리 저장
				os.flush();
				
				is.close();
				os.close();
				sc.close();
			}

		} catch (Exception e) {
			System.out.println("현재 서버포트가 중복되어 서버를 강제 종료 합니다");
		}
	}
}
