import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;

//file7에 대한 추가 설명 bufferReader + Array (output->input->output)
public class Buffer_array {

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
		System.out.println(ar);
		System.out.println(ar.size());
	}

}
