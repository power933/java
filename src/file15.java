import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

//이미지 용량 제한
public class file15 {

	public static void main(String[] args) throws IOException{
		String file = "C:\\java5\\File_Stream\\src\\img.jpg";
		InputStream is = new FileInputStream(file);
		
		//fileInputStream을 buffer로 사용하게 되면, 더 이상 FileInputStream을 사용 못함
		//그 수단으로 buffer에 new FileInputStream을 생성하여 별도로
		BufferedInputStream bi = new BufferedInputStream(new FileInputStream(file));
		byte[] filesize = new byte[bi.available()];
		int total = bi.read(filesize);
		
		if (total > filesize.length) {
			System.out.printf("이미지 제한 용량은 %s kb 까지 입니다",filesize.length/1024);
		}
		else {
			System.out.println("정상 적용");
			FileOutputStream fo = new FileOutputStream("img_copy.jpg");
			fo.write(filesize);
		}
		
		
		
		
	}

}
