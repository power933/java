import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class file8 {

	public static void main(String[] args) throws IOException {
		
		/*
		 * list�� �ֻ��� �迭 Ŭ����
		 * files : �ű� IO Ŭ����. readAllLines(��ü ������ �ѹ��� ��� ����)
		 * files + paths.get(���)
		 */
		
		List<String> data = Files.readAllLines(Paths.get("C:\\java5\\File_Stream\\src\\Buffer.txt"));
		System.out.println(data);
		
		//���� : �޸��Ҵ� ������, �ѱ� �����Ŷ�� �����ؾ���
		byte[] data2 = Files.readAllBytes(Paths.get("C:\\java5\\File_Stream\\src\\Buffer.txt"));
		System.out.println(new String(data2));
	}

}
