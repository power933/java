
public class prac {

	public static void main(String[] args) {

		class_box cb = new class_box();
		for (int a = 0; a < 10; a++) {
			cb.run("클래스 처리 안함" + a);
		}

		cpu_box cp = null;
		// 쓰레드를 이용하여 먼저 처리된 결과 순으로 나오도록 합니다.
		for (int b = 0; b < 10; b++) {
			cp = new cpu_box("쓰레드 처리현황" + b);
			cp.start();
		}
		//쓰레드를 이용한 강제 예외처리 방식이며 문제가 발생 하더라도
		//해당 문제가 발생한 쓰레드 예외처리 그 외 사항은 모두 처리하는 예시
		call_box bb = null;
		int w = 0;
		String msg = "";
		String msg2 = "";
		while (w < 10) {
			if (w == 5) {
				msg2 = "5";
			} else {
				msg2 = "";
			}
			bb = new call_box(msg + msg2);
			bb.start();
			w++;
		}

	}

}

class cpu_box extends Thread {
	String a = null;

	cpu_box(String a) {
		this.a = a;
	}

	@Override
	public void run() {
		System.out.println(a);
	}
}

class class_box extends Thread {

	public void run(String a) {
		System.out.println(a);
	}
}

class call_box extends Thread {
	String callname = null;

	public call_box(String z) {
		callname = z;
	}

	@Override
	public void run() {
		try {
			
			if (callname.length()>0) {
				throw new Exception();
			} else {
				System.out.println(callname.length());
			}
			
		} catch (Exception e) {
			System.out.println("w=5");
		}
	}

}
