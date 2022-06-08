package App;

import java.util.Scanner;

public class App1 {

	public static void main(String[] args) {
		test1 ts = new test1();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("학생 이름 입력");
		String a = sc.next();
		ts.setName(a);
		System.out.println("과목입력");
		String b = sc.next();
		ts.setSub(b);
		result res = new result();
		System.out.println(res.getRe(a,b));
		
	}

}

class test1 {
	private String name = "";
	private String sub = "";
	
	public void setName(String name) {
		this.name = name;
	}
	public void setSub(String sub) {
		this.sub = sub;
	}
	public String getName() {
		return name;
	}
	public String getSub() {
		return sub;
	}
	
}