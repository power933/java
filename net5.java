import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

//Socket : Server, client : �޼���,���� ���� (�����)

//HTTP��� : Image, ������, ���� �����(��û)�� ������ �ۼ��� ���
public class net5 {
	// server
	public static void main(String[] args) {
		System.out.println("Server Connect");
		int port = 8080; // ������ ��Ʈ��ȣ�� ������(��, ���� �ߺ��� ��Ʈ�� ��� �ϸ� �ȵ�)
		String msg = "Success Connect!!";

		try {
			ServerSocket ss = new ServerSocket(port); // ServerSocket : ���½�ų ��Ʈ�� ����
			//������ �������� �ϱ� ���ؼ��� ServerSocket�� ���� ��ε� �ؼ��� �ȵ�
			while (true) {
				System.out.println("��������");
				Socket sc = ss.accept(); // accept() : Ŭ���̾�Ʈ�� ������ ���� ��� �ϴ� ������ �ϰ� ��
				System.out.println("ȣ��Ʈ:��� ���� ����");
				// �������� client�� �޴� ���
				InputStream is = sc.getInputStream(); // client���� ������ ���� �о����
				// client�� ������ ���
				OutputStream os = sc.getOutputStream(); // client�� ���� ����
				byte[] data = new byte[1024]; // client ���� �޴� ���� byte�� ����
				int n = is.read(data); // �ش� ���� �о����
				String msgclient = new String(data, 0, n); // �ش簪�� �迭�� Ȯ�� �Ͽ� ���� �̰�
				System.out.println(msgclient); // �̰��� ���� ��½�Ű�� ��

				String aws = "�ݰ����ϴ�"; // �������� ������ �޼���
				os.write(aws.getBytes()); // client�� ������ ���� �޸� ����
				os.flush();
				
				is.close();
				os.close();
				sc.close();
			}

		} catch (Exception e) {
			System.out.println("���� ������Ʈ�� �ߺ��Ǿ� ������ ���� ���� �մϴ�");
		}
	}
}
