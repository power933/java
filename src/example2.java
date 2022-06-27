import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.Buffer;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.security.PublicKey;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import javax.print.attribute.HashAttributeSet;

public class example2 {

	public static void main(String[] args) {
		/*
		 	�ش� ������ �� ������ �� ���� ��Ȳ�� ������ ������ �Դϴ�.
		 	�ش� ������ �� 100�̸��� ������ ���� �︸
		 	20220623.txt���Ϸ� ������ ����ǵ��� �Ͻʽÿ�.
		 */
		
		test t = new test();
	}

}


class test{
	String uri = "C:\\java5\\File_Stream\\src\\";
	ArrayList<String> al = new ArrayList<>();
	String db;
	String res="";
	
	test(){
		try {
		db();
//		newFile("test1.txt");
		input("test1.txt",db);
		output("test1.txt");
		compare();
		}
		catch (Exception e) {
			
		}
	}
	public void newFile(String a){
		Path data = Paths.get(uri);
		try {
			Files.createFile(data);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void input(String a, String db) throws IOException{
		
		OutputStream os = new FileOutputStream(uri+a);
		byte[] datas = db.getBytes();
		os.flush();
		os.write(datas);
	}
		

	public void output(String a) throws IOException {
		
		try {
			FileReader fr = new FileReader(uri+a);
			BufferedReader br = new BufferedReader(fr);
			String tmp = "";
			while((tmp=br.readLine())!=null) {
				al.add(tmp);
			}
		} catch (FileNotFoundException e) {
			System.out.println(e);
		}
		
	}
	public void compare() throws IOException {
		ArrayList<String> result = new ArrayList<>();
		Object arr[] = new Object[al.size()];
		double arr1[] = new double[al.size()];
		String arr2[] = new String[al.size()];
		
		try {
		for(int i = 0; i<al.size();i++) {
			arr = al.get(i).split(",");
			arr1[i] = Double.parseDouble(String.valueOf(arr[1]));
			arr2[i] = (String)arr[0];
		}
		}
		catch (Exception e) {
			System.out.println(e);
		}
		for(int i = 0; i<arr1.length;i++) {
			if(arr1[i]<100) {
				result.add(arr2[i]);
			}
		}
		for(int i = 0;i<result.size();i++) {
			res+=result.get(i)+" ";
		}
		System.out.println(result);
		System.out.println(res);
//		newFile("newtest.txt");
		input("newtest.txt", res);
	}
	public void db() {
		String db = "������,671.126\r\n"
				+ "�����,132.03\r\n"
				+ "������,23.29\r\n"
				+ "�޹��,108.58\r\n"
				+ "�Ҿ簭��,164.462\r\n"
				+ "�Ǿϴ�,69.79\r\n"
				+ "û���,49.52\r\n"
				+ "��õ��,101.01\r\n"
				+ "���ִ�,119.613\r\n"
				+ "������������,64.55\r\n"
				+ "�ȴ��,24.87\r\n"
				+ "��ȭ�Ǵ�,163.53\r\n"
				+ "��ź����,47.259\r\n"
				+ "ȭõ��,163.46\r\n"
				+ "Ⱦ����,166.56";
		this.db = db;
	}
}




