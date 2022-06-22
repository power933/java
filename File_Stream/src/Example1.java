import java.io.IOException;
import java.io.ObjectInputStream.GetField;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

public class Example1 {

	public static void main(String[] args) throws IOException{
		
		/*
		 	해당 사용자가 영화제목을 검색합니다
		 	해당 영화제목에 맞는 데이터값이 있을 경우
		 	영화전체에 대한 정보를 출력하게 됩니다.
		 	힌트 : Scanner 사용
		 	"검색할 영화제목을 입력하세요" : 범죄도시2
		 	[범죄도시2] - 추천5 2022년 4월 개봉
		 	"검색할 영화 제목을 입력하세요" 뽀로로
		 	"검색한 영화는 확인 되지 않습니다."
		 */
		
		List<String> db = Files.readAllLines(Paths.get("C:\\java5\\File_Stream\\src\\movie_db.txt"));
		Scanner sc = new Scanner(System.in);
		System.out.println("검색할 영화 제목을 입력하세요");
		String a = sc.next();
		
		
		for(int i = 0;i<db.size();i++) {
			if(db.get(i).contains(a)) {
				System.out.println(db.get(i));
			}
			else {
				System.out.println("검색한 영화는 확인되지 않습니다.");
			}
		}
		
	}

}
