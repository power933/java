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
				System.out.println("���� ���� �Ǿ����ϴ�");
				 os = sc.getOutputStream();
				 is = sc.getInputStream();
				
				while(true) {	//���������� ���Ͽ� ��� ���ӵǵ��� �ϴ� ����
				System.out.println("�Է��Ͻ� ������ �����ּ���");
				msg = "ȫ�浿 : "+sn.nextLine().intern();
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
					System.out.println("������� �߻�");
				}
			}
			finally {	//Ŭ���̾�Ʈ�� ���� ����� �ش� ��Ĺ �� ���� ��Ʈ��,��ĳ�� ����
				try {
					os.close();
					is.close();
					sc.close();
					System.out.println("����");
				} catch (Exception e2) {
					
				}
			}
			
			
			
		
	}
}
