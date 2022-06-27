import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class file6 {

	public static void main(String[] args) throws IOException {
		try {
			FileWriter fw = new FileWriter("C:\\java5\\File_Stream\\src\\db.txt");
			Scanner sc = new Scanner(System.in);
			System.out.println("내용을 입력해주세요");
			for (;;) {
				String notice = sc.nextLine().intern();
				if (notice=="99") {
					break;
				}
				fw.write(notice + "\n");
			}
			sc.close();
			fw.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
