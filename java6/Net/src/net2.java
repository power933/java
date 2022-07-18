import java.io.BufferedInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;

//전송형태의 프로토콜
//TCP(연결 프로토콜) - 전송속도가 빠름 
//UDP(사용자 데이터 프로토콜) - 전송 속도가 느림(1:1일경우는 굉장히 빠름)
/*PORT(TCP)
  80 : web	(http://)
  21 : FTP	(파일 전송시 사용)
  22 : SSH - linux,unix (파일전송, 서버 외부 접속)
  23 : TelNet - window	(서버 외부 접속)
  443 : WEB(https://)
  25 : SMTP (메일서버)
  110 : POP3(메일받기) - 문자, 파일 받기 (비동기화 - 한번 지우면 끝)
  143 : IMAP(메일받기) - 문자, 파일 받기 (서버 동기화 - 서버에 저장)
 */
/*
 	SNMP : UDP(문자발송시스템), VPN(가상IP) - UDP
 	
 */
public class net2 {
	
	public static void main(String[] args) throws IOException  {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("웹에서 가져올 이미지 주소를 입력해 주세요");
		String url = sc.next();
		
		URL u = new URL(url);	//URL(클래스) : 네트워크 경로를 말합니다.
		URLConnection con = u.openConnection(); //해당 경로를 연결
		System.out.println(con);
		
		int imgsize = con.getContentLength();	//-1(없음), 그 외에는 파일 확인
		System.out.println(imgsize);
		String imgtype = con.getContentType();	//파일속성을 확인하는 부분
		System.out.println(imgtype);	
//		long date = con.getDate();	//파일 로드 날짜
//		System.out.println(date);
		
		//openStream() : URL에서만 사용
		InputStream is = u.openStream();	//URL에서 파일을 읽어올때 사용함
		BufferedInputStream bi = new BufferedInputStream(is);	//URL에서 읽은 파일을 임시 저장함
		FileOutputStream fo = new FileOutputStream("copy.jpg");
		byte data[] = new byte[1024]; //1kb로 해당 파일을 조각냄
		
		int imgdata = 0;
		int cnt = 0;
		while((imgdata=bi.read(data))!=-1) {
			fo.write(data,0,imgdata);	//조각난 파일을 붙여넣기 하는 상태
			System.out.println("다운로드중..." + cnt*100/imgsize + "%");
			cnt+= imgdata;
		}
		fo.flush();
		fo.close();
		sc.close();
		
	}

}



