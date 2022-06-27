import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;

//이미지(binary) 파일 설정 byte단위 (FileReader (x))
//FileInputStream 이용 해야함 read()만 사용
public class file14 {

	public static void main(String[] args) {
		String uri = "C:\\java5\\File_Stream\\src\\img.jpg";
		try {
		InputStream is = new FileInputStream(uri);
//		System.out.println(is.read());  Stream은 버퍼와 비슷하여 read를 사용하는 순간 해당 메모리에서 비워짐
//		byte b[] = new byte[is.available()];
//		System.out.println(is.read(b));	//전체 크기 용량확인
		
		FileOutputStream os = new FileOutputStream("img_test.jpg");
		int img = 0;	//읽는 바이트수
		int check = 0;	//읽는 횟수
//		os.write(b);	//반복문 없이 읽음
//		System.out.println(is.available());
		byte b[] = new byte[is.available()/100];
//		while((img=is.read(b))!=-1) {
		
		// 다운로드시 로드를 출력이나 progress를 이용하여 보여줄 때
		 
		while(true) {
			img = is.read(b);	//해당 파일을 읽어서 바이트 변수로 넘김
			if(img == -1) {
				break;
			}
			else {
				os.write(b,0,img);	//다운로드 %를 표시할때 사용하기 위함
			}
			System.out.println(check + "%");
			check++;
			
		}
		}
		catch (Exception e) {
		
		}
		
	}

}
