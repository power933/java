
import App.*;	//다른 package를 로드시 import 하여 사용함
//외부 package 에서 app1.java 파일 로드 및 기본 파일을 로드 하여 사용합니다.
public class Method11 {
	public static void main(String[] args) {
		
		App1 b = new App1(); 	//main 메소드를 로드
		b.main(args);
		b.abox(); // 퍼블릭 클래스 안에서 abox라는 void 메소드를 로드 하는 부분 
	}
}
