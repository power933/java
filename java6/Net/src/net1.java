import java.awt.Desktop;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;

public class net1 {
	//UnknownHostException : 호스트 정보가 확인 되지 않을 경우
	public static void main(String[] args) throws UnknownHostException {
		
		//InetAdress : IPnetworkAddress
		//getByName : 접속할 도메인 주소명을 말합니다.
		InetAddress ia = InetAddress.getByName("localhost");
		System.out.println(ia);	
//		System.out.println(ia.getHostName());		//도메인명
//		System.out.println(ia.getHostAddress());	//DNS에 연결된 IP
		
		//getAllByName : 도메인에 IP정보 확인(배열로 구성해야 합니다.)
		InetAddress[] ia2 = InetAddress.getAllByName("google.com");
		System.out.println(ia2.length);	//해당 DNS에 IP갯수
		for(int i = 0;i<ia2.length;i++) {
			System.out.println(ia2[i].getHostAddress());
		}
		
	}

}
