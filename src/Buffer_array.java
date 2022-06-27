import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Scanner;

//file7에 대한 추가 설명 bufferReader + Array (output->input->output)
public class Buffer_array {
	static String dir1 = "C:\\java5\\File_Stream\\src\\qwer.txt";
	public static void main(String[] args) throws IOException {
		String dir = "C:\\java5\\File_Stream\\src\\Buffer.txt";
		FileReader fr = new FileReader(dir,Charset.forName("UTF8"));
		BufferedReader br = new BufferedReader(fr);
		ArrayList<String> ar = new ArrayList<>();
		String word = "";
		while((word=br.readLine())!=null) {	//버퍼에 있는 값을 String 자료형으로 이전 후
			ar.add(word);		//배열에 넣음
		}
		br.close();
//		System.out.println(ar);
//		System.out.println(ar.size());
		Reader r = new Reader();
		r.name();
	}

}

class Reader{
	public void name() throws IOException{
		String dir = Buffer_array.dir1;
		File f = new File(dir);
		f.createNewFile();
		
		FileWriter fw = new FileWriter(dir);
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i<5;i++) {
			String wr = sc.nextLine();
			fw.write(wr + "\n");
		}
		fw.close();
		
		FileReader fr = new FileReader(dir,Charset.forName("EUC-KR"));
		BufferedReader bf = new BufferedReader(fr);
		ArrayList<String> al = new ArrayList<>();
		String line = null;
		while((line = bf.readLine())!=null) {
			al.add(line);
		}
		System.out.println(al);
		
	}
}





