import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class tclient {
	public static void main(String[] args) {
		try {
		int port = 8082;
		String ip = "127.0.0.1";
		Socket sc = new Socket(ip,port);
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			InputStream is = sc.getInputStream();
			OutputStream os = sc.getOutputStream();
			byte[] data = new byte[1024];
			String msg = scan.nextLine();
			os.write(msg.getBytes());
			
			
			int a = is.read(data);
			String message = new String(data,0,a);
			System.out.println(message);
			
		}
		}
		catch (Exception e) {
			// TODO: handle exception
		}
	}
}
