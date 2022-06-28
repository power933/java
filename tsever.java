import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class tsever {
	public static void main(String[] args)  {
		
		int port = 8082;
		
		try {
			ServerSocket ss = new ServerSocket(port);
			
			while(true) {
			Socket sc = ss.accept();
			System.out.println("연결");
			InputStream is = sc.getInputStream();
			BufferedReader br = new BufferedReader(new InputStreamReader(is));
			
			System.out.println(br.readLine());
			
			OutputStream os = sc.getOutputStream();
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(os));
			PrintWriter pw = new PrintWriter(bw,true);
			
			pw.print("to 클라이언트");
			
			
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}
}
