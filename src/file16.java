import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;

//�̹��� �б�, ����

public class file16 {

	public static void main(String[] args) throws IOException{
		//r,w,x => r : �б�, w : ���� x(excute) : ����
		//RandomAccessFile : ����ڰ� �ش� ���ϼӼ� ������ ������ �� ����
		try {
		String files = "C:\\java5\\File_Stream\\src\\img.jpg";
		String cp = "img222.jpg";
		RandomAccessFile file = new RandomAccessFile(files, "r");
		RandomAccessFile file2 = new RandomAccessFile(cp, "rw");
		
		//filechanner : IO(FileInputStream, FileOutputStream) ���� ����
		//getChannel() : �ش� �޼ҵ带 �������� ����
		FileChannel fc = file.getChannel();
		FileChannel target = file2.getChannel();
		
		fc.transferTo(0, fc.size(), target);
		target.transferFrom(fc, 0, fc.size());	//(������ ����, �迭0,�迭 ����ȣ)
		}
		
		catch (Exception e) {
			
		}
	}

}
	