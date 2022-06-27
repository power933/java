import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 	InputStream > InputStreamReader > BufferedReader (o)
 	inputStream > BufferedReader (x)
 	InputStream > BufferedInputStream (o)
 	InputStreamReader > BufferedReader (o)
 	
 	* BufferedReader - close(), �޸�����, BufferedWriter - flush()�޸𸮸� �ʱ�ȭ�� close()
 */

public class filelast {

	public static void main(String[] args) throws IOException {
		
		String uri = "src\\movie_db.txt";
		FileInputStream fs = new FileInputStream(uri);
		InputStreamReader ir = new InputStreamReader(fs,"UTF8");
		
		BufferedReader br = new BufferedReader(ir);
		System.out.println(br.readLine());
		
		
		
		
		
	}

}
