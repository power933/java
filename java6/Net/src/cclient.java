import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class cclient {
	
	final String ip = "127.0.0.1";
	final int port = 9090;
	Scanner sc = null;
	String myid = "";
	
	public void asd() {
		try {
			sc = new Scanner(System.in);
			System.out.println("ä�ÿ� ����� ���̵� �Է��ϼ���");
			myid = sc.nextLine();
			Socket sk = new Socket(ip,port);
			String message = "";
			OutputStream os = sk.getOutputStream();
			PrintWriter pw = new PrintWriter(os,true);
			InputStream is = sk.getInputStream();
			BufferedReader br = new BufferedReader(new InputStreamReader(is));
			
			while(true) {
				
				System.out.println(br.readLine());
				System.out.println("������ �Է��� �ּ���");
				message = sc.nextLine();
				pw.println(message);
				
			}
//			is.close();
//			sk.close();
			
		} catch (Exception e) {
			
		}
	}
	
	public static void main(String[] args) {
		
		cclient c = new cclient();
		c.asd();
				
		
	}
}
