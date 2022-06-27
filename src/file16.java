import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;

//이미지 읽기, 쓰기

public class file16 {

	public static void main(String[] args) throws IOException{
		//r,w,x => r : 읽기, w : 쓰기 x(excute) : 실행
		//RandomAccessFile : 사용자가 해당 파일속성 권한을 설정할 수 있음
		try {
		String files = "C:\\java5\\File_Stream\\src\\img.jpg";
		String cp = "img222.jpg";
		RandomAccessFile file = new RandomAccessFile(files, "r");
		RandomAccessFile file2 = new RandomAccessFile(cp, "rw");
		
		//filechanner : IO(FileInputStream, FileOutputStream) 같은 형태
		//getChannel() : 해당 메소드를 가져오는 역할
		FileChannel fc = file.getChannel();
		FileChannel target = file2.getChannel();
		
		fc.transferTo(0, fc.size(), target);
		target.transferFrom(fc, 0, fc.size());	//(복사할 파일, 배열0,배열 끝번호)
		}
		
		catch (Exception e) {
			
		}
	}

}
	