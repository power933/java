import java.io.BufferedInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;

//���������� ��������
//TCP(���� ��������) - ���ۼӵ��� ���� 
//UDP(����� ������ ��������) - ���� �ӵ��� ����(1:1�ϰ��� ������ ����)
/*PORT(TCP)
  80 : web	(http://)
  21 : FTP	(���� ���۽� ���)
  22 : SSH - linux,unix (��������, ���� �ܺ� ����)
  23 : TelNet - window	(���� �ܺ� ����)
  443 : WEB(https://)
  25 : SMTP (���ϼ���)
  110 : POP3(���Ϲޱ�) - ����, ���� �ޱ� (�񵿱�ȭ - �ѹ� ����� ��)
  143 : IMAP(���Ϲޱ�) - ����, ���� �ޱ� (���� ����ȭ - ������ ����)
 */
/*
 	SNMP : UDP(���ڹ߼۽ý���), VPN(����IP) - UDP
 	
 */
public class net2 {
	
	public static void main(String[] args) throws IOException  {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("������ ������ �̹��� �ּҸ� �Է��� �ּ���");
		String url = sc.next();
		
		URL u = new URL(url);	//URL(Ŭ����) : ��Ʈ��ũ ��θ� ���մϴ�.
		URLConnection con = u.openConnection(); //�ش� ��θ� ����
		System.out.println(con);
		
		int imgsize = con.getContentLength();	//-1(����), �� �ܿ��� ���� Ȯ��
		System.out.println(imgsize);
		String imgtype = con.getContentType();	//���ϼӼ��� Ȯ���ϴ� �κ�
		System.out.println(imgtype);	
//		long date = con.getDate();	//���� �ε� ��¥
//		System.out.println(date);
		
		//openStream() : URL������ ���
		InputStream is = u.openStream();	//URL���� ������ �о�ö� �����
		BufferedInputStream bi = new BufferedInputStream(is);	//URL���� ���� ������ �ӽ� ������
		FileOutputStream fo = new FileOutputStream("copy.jpg");
		byte data[] = new byte[1024]; //1kb�� �ش� ������ ������
		
		int imgdata = 0;
		int cnt = 0;
		while((imgdata=bi.read(data))!=-1) {
			fo.write(data,0,imgdata);	//������ ������ �ٿ��ֱ� �ϴ� ����
			System.out.println("�ٿ�ε���..." + cnt*100/imgsize + "%");
			cnt+= imgdata;
		}
		fo.flush();
		fo.close();
		sc.close();
		
	}

}



