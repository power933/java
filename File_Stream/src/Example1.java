import java.io.IOException;
import java.io.ObjectInputStream.GetField;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

public class Example1 {

	public static void main(String[] args) throws IOException{
		
		/*
		 	�ش� ����ڰ� ��ȭ������ �˻��մϴ�
		 	�ش� ��ȭ���� �´� �����Ͱ��� ���� ���
		 	��ȭ��ü�� ���� ������ ����ϰ� �˴ϴ�.
		 	��Ʈ : Scanner ���
		 	"�˻��� ��ȭ������ �Է��ϼ���" : ���˵���2
		 	[���˵���2] - ��õ5 2022�� 4�� ����
		 	"�˻��� ��ȭ ������ �Է��ϼ���" �Ƿη�
		 	"�˻��� ��ȭ�� Ȯ�� ���� �ʽ��ϴ�."
		 */
		
		List<String> db = Files.readAllLines(Paths.get("C:\\java5\\File_Stream\\src\\movie_db.txt"));
		Scanner sc = new Scanner(System.in);
		System.out.println("�˻��� ��ȭ ������ �Է��ϼ���");
		String a = sc.next();
		
		
		for(int i = 0;i<db.size();i++) {
			if(db.get(i).contains(a)) {
				System.out.println(db.get(i));
			}
			else {
				System.out.println("�˻��� ��ȭ�� Ȯ�ε��� �ʽ��ϴ�.");
			}
		}
		
	}

}
