import java.awt.Desktop;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;

public class net1 {
	//UnknownHostException : ȣ��Ʈ ������ Ȯ�� ���� ���� ���
	public static void main(String[] args) throws UnknownHostException {
		
		//InetAdress : IPnetworkAddress
		//getByName : ������ ������ �ּҸ��� ���մϴ�.
		InetAddress ia = InetAddress.getByName("localhost");
		System.out.println(ia);	
//		System.out.println(ia.getHostName());		//�����θ�
//		System.out.println(ia.getHostAddress());	//DNS�� ����� IP
		
		//getAllByName : �����ο� IP���� Ȯ��(�迭�� �����ؾ� �մϴ�.)
		InetAddress[] ia2 = InetAddress.getAllByName("google.com");
		System.out.println(ia2.length);	//�ش� DNS�� IP����
		for(int i = 0;i<ia2.length;i++) {
			System.out.println(ia2[i].getHostAddress());
		}
		
	}

}
