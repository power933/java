import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 	InputStream > InputStreamReader > BufferedReader (o)
 	inputStream > BufferedReader (x)
 	InputStream > BufferedInputStream (o)
 	InputStreamReader > BufferedReader (o)
 	
 	* BufferedReader - close(), 메모리종료, BufferedWriter - flush()메모리를 초기화함 close()
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
