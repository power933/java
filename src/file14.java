import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;

//�̹���(binary) ���� ���� byte���� (FileReader (x))
//FileInputStream �̿� �ؾ��� read()�� ���
public class file14 {

	public static void main(String[] args) {
		String uri = "C:\\java5\\File_Stream\\src\\img.jpg";
		try {
		InputStream is = new FileInputStream(uri);
//		System.out.println(is.read());  Stream�� ���ۿ� ����Ͽ� read�� ����ϴ� ���� �ش� �޸𸮿��� �����
//		byte b[] = new byte[is.available()];
//		System.out.println(is.read(b));	//��ü ũ�� �뷮Ȯ��
		
		FileOutputStream os = new FileOutputStream("img_test.jpg");
		int img = 0;	//�д� ����Ʈ��
		int check = 0;	//�д� Ƚ��
//		os.write(b);	//�ݺ��� ���� ����
//		System.out.println(is.available());
		byte b[] = new byte[is.available()/100];
//		while((img=is.read(b))!=-1) {
		
		// �ٿ�ε�� �ε带 ����̳� progress�� �̿��Ͽ� ������ ��
		 
		while(true) {
			img = is.read(b);	//�ش� ������ �о ����Ʈ ������ �ѱ�
			if(img == -1) {
				break;
			}
			else {
				os.write(b,0,img);	//�ٿ�ε� %�� ǥ���Ҷ� ����ϱ� ����
			}
			System.out.println(check + "%");
			check++;
			
		}
		}
		catch (Exception e) {
		
		}
		
	}

}
