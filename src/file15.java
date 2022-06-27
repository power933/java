import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

//�̹��� �뷮 ����
public class file15 {

	public static void main(String[] args) throws IOException{
		String file = "C:\\java5\\File_Stream\\src\\img.jpg";
		InputStream is = new FileInputStream(file);
		
		//fileInputStream�� buffer�� ����ϰ� �Ǹ�, �� �̻� FileInputStream�� ��� ����
		//�� �������� buffer�� new FileInputStream�� �����Ͽ� ������
		BufferedInputStream bi = new BufferedInputStream(new FileInputStream(file));
		byte[] filesize = new byte[bi.available()];
		int total = bi.read(filesize);
		
		if (total > filesize.length) {
			System.out.printf("�̹��� ���� �뷮�� %s kb ���� �Դϴ�",filesize.length/1024);
		}
		else {
			System.out.println("���� ����");
			FileOutputStream fo = new FileOutputStream("img_copy.jpg");
			fo.write(filesize);
		}
		
		
		
		
	}

}
