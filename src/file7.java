import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.LineNumberReader;
import java.nio.charset.Charset;
import java.util.Scanner;

/*
 	공통 명령어 사항 : read(), readLine(),next(),nextLine();
 */

//BufferReader : output
public class file7 {
	
	public static void main(String[] args)throws IOException {
		String dir = "C:\\java5\\File_Stream\\src\\Buffer.txt";
//		File f = new File(dir);
//		f.createNewFile();
//		FileWriter fw = new FileWriter(dir,true);
//		Scanner sc = new Scanner(System.in);
//		String a = sc.nextLine();
//		fw.write(a+"\n");
//		fw.close();
		try {
		
		FileReader fr = new FileReader(dir,Charset.forName("UTF8"));
		//bufferReader : temp(임시 저장소) -효율적으로 파일을 빠르게 가져올 수 있음
		FileReader fr1 = new FileReader(dir,Charset.forName("UTF8"));
			BufferedReader bf = new BufferedReader(fr);	//readLine()으로 해당값을 가져옴
			BufferedReader bf1 = new BufferedReader(fr1);	//readLine()으로 해당값을 가져옴
//			System.out.println(bf.readLine());	//해당 임시저장소에서 저장된 내용중 한개의 라인으로 로드하게 됩니다
			/*
			 	buffer는 최초 값을 출력하였을 경우 무조건 다음 라인의 값을 출력하게 됩니다.
			 */
			
			if(bf.readLine() !=null) {	//여기서도 때리는순간 한줄 날라감
				
				int w = 0;
				while(w<2) {
					System.out.println(bf.readLine());	
					//bf.readline쓰면 쓰는 라인마다 한줄씩 담아서 태워버림
					//조심히 쓰자. 쓸거면 반복문에 깔끔하게 다 태우던가 아니면 재귀함수,메소드등 이용
					w++;
				}
			}
//			 	데이터 문서의 라인 갯수를 확인 하는 방법
			LineNumberReader li = new LineNumberReader(fr1);
			int ea = 0;
			while(li.readLine()!=null) {
				ea = li.getLineNumber();
			}
			System.out.println(ea);
			
			//Buffer는 속도가 빠른 대신 사용 부분에 무조건 변수 또는 배열로 받은 후 처리를 권장
			String line = "";
			while((line=bf1.readLine())!=null) {
				System.out.println(line);
			}
			fr.close();
			fr1.close();
		}
		
		catch (Exception e) {
			// TODO: handle exception
		}
	}
}






