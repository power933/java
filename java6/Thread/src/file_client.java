import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class file_client {
	public static void main(String[] args) {
		f_client fc = new f_client();
		fc.files();
	}
}

class f_client{
	Socket sk = null;
	String ip = "127.0.0.1";
	int port = 8006;
	
	InputStream is = null;
	OutputStream os = null;
	
	public void files() {
		try {
			sk = new Socket(ip,port);
			
			is = sk.getInputStream();
			os = sk.getOutputStream();
			
			//첨부파일 byte 배열로 변경함
			String url = "C:\\Users\\tjoeun\\Desktop\\image.jpg";
			
			//클라이언트에서 보낼 이미지,동영상,음악,문서~~ 보낸 형식
			FileInputStream fs = new FileInputStream(url);
			BufferedInputStream bs = new BufferedInputStream(fs);
			//첨부파일 전송 형태
			
			byte img[] = new byte[bs.available()];
			int fordata = 0;
			
			while((fordata = bs.read(img))!=-1) {
				this.os.write(img,0,fordata);
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}


