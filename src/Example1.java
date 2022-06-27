import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream.GetField;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Example1 {

	public static void main(String[] args) throws IOException {

		/*
		 * �ش� ����ڰ� ��ȭ������ �˻��մϴ� �ش� ��ȭ���� �´� �����Ͱ��� ���� ��� ��ȭ��ü�� ���� ������ ����ϰ� �˴ϴ�. ��Ʈ :
		 * Scanner ��� "�˻��� ��ȭ������ �Է��ϼ���" : ���˵���2 [���˵���2] - ��õ5 2022�� 4�� ����
		 * "�˻��� ��ȭ ������ �Է��ϼ���" �Ƿη� "�˻��� ��ȭ�� Ȯ�� ���� �ʽ��ϴ�."
		 */

		List<String> db = Files.readAllLines(Paths.get("C:\\java5\\File_Stream\\src\\movie_db.txt"));
		Scanner sc = new Scanner(System.in);
//		System.out.println("�˻��� ��ȭ ������ �Է��ϼ���");
//		String a = sc.next();
//		int count = 0;
//		for (int i = 0; i < db.size(); i++) {
//			if (db.get(i).contains(a)) {
//				System.out.println(db.get(i));
//				count++;
//			}
//		}
//		if(count == 0) {
//			System.out.println("���� ����");
//		}
		
		System.out.println("1: ������ȭ, 2: ����������ȭ");
		int x = sc.nextInt();
		try {
			if(x==1) {
				movie m = new movie("movie_db.txt");
			}
			else if(x==2){
				System.out.println("��������");
			}
		}
		catch (Exception e) {
			// TODO: handle exception
		}
		
	}
}

class movie{
	private String url = "C:\\java5\\File_Stream\\src\\";
	private BufferedReader bf = null;
	private FileReader fr = null;
	private ArrayList<String> list = null;
	Scanner sc = null;
	 public movie(String fileName) throws IOException{
		try {
			fr = new FileReader(url+fileName, Charset.forName("UTF8"));
			custom();
			bf.close();
			fr.close();
			search();
		}
		catch (Exception e) {
			System.out.println(e);
		}
	}
	public void custom() throws IOException{
		bf = new BufferedReader(fr);
		list = new ArrayList<>();
		String datas=bf.readLine();
		do {
			list.add(datas);
		}
		while((datas=bf.readLine())!=null);
		
//		System.out.println(list);
	}
	
	public void search() {
		sc = new Scanner(System.in);
		System.out.println("�˻��� ��ȭ ���� �Է�");
		String subject = sc.next().intern();
		boolean b = false;
		for(String moviesb : list) {
			if(moviesb.indexOf(subject)!=-1) {
				System.out.println(moviesb);
				b = true;
			}
		}
		if(b == false) {
			System.out.println("��ȭ ����");
		}
		search();
		if(subject == "����") {
			System.exit(0);
		}
	}
}






