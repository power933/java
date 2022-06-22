import java.io.FileWriter;
import java.io.IOException;

public class file4 {

	public static void main(String[] args) throws Exception {
		
		try {
//			FileWriter : 문자 데이터를 파일에 쓰는 class
			String user[] = {"눈물이","차올라서","고갤들어","흐르지 못하게"};
//			FileWriter fw = new FileWriter("C:\\java5\\File_Stream\\src\\array.txt");	
			FileWriter fw = new FileWriter("C:\\java5\\File_Stream\\src\\array.txt",true);
//			트루 없으면 기존데이터 다 날리고 새로 작성함
			for(int i =0;i<user.length;i++) {
				fw.write(user[i]);	//write : 문자,배열 데이터 값을 파일에 적용함
			}
			fw.close();		//filewriter는 클로즈 써야 적용됨.
		}
		catch(Exception e) {
			System.out.println("test");
		}
	}

}
