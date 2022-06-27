import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

//bufferdWriter
//buffered : read,write 단독으로 사용하지 않음
public class file17 {

	public static void main(String[] args) throws IOException {

		try {
			OutputStreamWriter os = new OutputStreamWriter(System.out);
			BufferedWriter bw = new BufferedWriter(os);
			bw.write("홍길동입니다");
			bw.close();
			
			InputStreamReader is = new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(is);
//			BufferedReader br = new BufferedReader(new InputStreamReader(bw));
			String test = br.readLine();
			System.out.println(test);

			System.out.println(bw);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
