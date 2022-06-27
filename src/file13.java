import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class file13 {

	public static void main(String[] args) throws IOException{
		try {
			
//			createDirectories : 신규디렉토리 생성
//			Files.createDirectories(Paths.get("C:\\java5\\File_Stream\\src\\test"));
			
//			Path data1 = Paths.get("C:\\java5\\File_Stream\\src\\movie_db.txt");
//			Path data2 = Paths.get("C:\\java5\\File_Stream\\src\\movie2_db.txt");
//			Files.copy(data1, data2);
			
//			Path data3 = Paths.get("C:\\java5\\File_Stream\\src\\movie2_db.txt");
//			Path directory = Paths.get("C:\\java5\\movie2_db.txt");
//			Files.move(directory,data3);
			
//			Path data3 = Paths.get("C:\\java5\\File_Stream\\src\\image.jpg");
//			Files.delete(data3);
			
			Path data3 = Paths.get("C:\\java5\\File_Stream\\src\\image.jpg");
			Files.createFile(data3);
			
		}
		catch (Exception e) {
			System.out.println(e);
		}
		
		
	}

}








