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
		 	���� ���α׷��� �����մϴ�. ���� ���� ���� �ش� ������ �ϰ� ��
		 	"����Ͻ� ��Ʈ ��ȣ�� �Է����ּ���" : 9009 (������ ���ڸ� �Է¹���)
		 	***********ä�ü��� ����[9009]************
		 	
		 	Ŭ���̾�Ʈ ���α׷� �����մϴ�.
		 	"������ ip��ȣ�� �Է����ּ���" 
		 	"������ port��ȣ�� �Է��� �ּ���"
		 	*************
		 	
		 	���� ���� �޼���
		 	"*********** GUEST�� ���� �Ͽ����ϴ� *********
		 */
		
		chat_ser cs = new chat_ser();
		
	}

}

class chat_ser{
	int port = 0;
	public chat_ser() {
		System.out.println("����Ͻ� ��Ʈ ��ȣ�� �Է����ּ���");
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




