import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream.GetField;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Example1 {

	public static void main(String[] args) throws IOException {

		/*
		 * 해당 사용자가 영화제목을 검색합니다 해당 영화제목에 맞는 데이터값이 있을 경우 영화전체에 대한 정보를 출력하게 됩니다. 힌트 :
		 * Scanner 사용 "검색할 영화제목을 입력하세요" : 범죄도시2 [범죄도시2] - 추천5 2022년 4월 개봉
		 * "검색할 영화 제목을 입력하세요" 뽀로로 "검색한 영화는 확인 되지 않습니다."
		 */

		List<String> db = Files.readAllLines(Paths.get("C:\\java5\\File_Stream\\src\\movie_db.txt"));
		Scanner sc = new Scanner(System.in);
//		System.out.println("검색할 영화 제목을 입력하세요");
//		String a = sc.next();
//		int count = 0;
//		for (int i = 0; i < db.size(); i++) {
//			if (db.get(i).contains(a)) {
//				System.out.println(db.get(i));
//				count++;
//			}
//		}
//		if(count == 0) {
//			System.out.println("정보 없음");
//		}
		
		System.out.println("1: 개봉영화, 2: 개봉예정영화");
		int x = sc.nextInt();
		try {
			if(x==1) {
				movie m = new movie("movie_db.txt");
			}
			else if(x==2){
				System.out.println("개봉안함");
			}
		}
		catch (Exception e) {
			// TODO: handle exception
		}
		
	}
}

class movie{
	private String url = "C:\\java5\\File_Stream\\src\\";
	private BufferedReader bf = null;
	private FileReader fr = null;
	private ArrayList<String> list = null;
	Scanner sc = null;
	 public movie(String fileName) throws IOException{
		try {
			fr = new FileReader(url+fileName, Charset.forName("UTF8"));
			custom();
			bf.close();
			fr.close();
			search();
		}
		catch (Exception e) {
			System.out.println(e);
		}
	}
	public void custom() throws IOException{
		bf = new BufferedReader(fr);
		list = new ArrayList<>();
		String datas=bf.readLine();
		do {
			list.add(datas);
		}
		while((datas=bf.readLine())!=null);
		
//		System.out.println(list);
	}
	
	public void search() {
		sc = new Scanner(System.in);
		System.out.println("검색할 영화 제목 입력");
		String subject = sc.next().intern();
		boolean b = false;
		for(String moviesb : list) {
			if(moviesb.indexOf(subject)!=-1) {
				System.out.println(moviesb);
				b = true;
			}
		}
		if(b == false) {
			System.out.println("영화 없음");
		}
		search();
		if(subject == "종료") {
			System.exit(0);
		}
	}
}






