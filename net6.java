import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class net6 {
	//client
	public static void main(String[] args) throws Exception{
		System.out.println("Ŭ���̾�Ʈ");
		String ip = "127.0.0.1";	//localhost
		int port = 8080;
		try {
			Socket sc = new Socket(ip,port);	//������ ����IP,������ ���� port
			System.out.println("������ ����Ǿ����ϴ�.");
			String cmsg = "�ȳ��ϼ���";
			//client���� server�� ������ ���
			OutputStream os = sc.getOutputStream();
			
			
			//server���� ������ ���� �޴� ���
			//client���� ������ �޼����� �޸𸮿� ���� �� byte�� ����
			InputStream is = sc.getInputStream();
			os.write(cmsg.getBytes());
			os.flush();
			
			//server���� ȸ��� ������ byte�迭�� ���� �� ����� �ϰ� ��
			byte data[] = new byte[1024];
			int a = is.read(data);
			String sm = new String(data,0,a);
			System.out.println(sm);
			
			sc.close();
			os.close();
			is.close();
			
			
		} catch (Exception e) {
			System.out.println("���� ���ῡ ���� �Ͽ����ϴ�");
		}
		
	}

}
