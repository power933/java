
public class prac {

	public static void main(String[] args) {

		class_box cb = new class_box();
		for (int a = 0; a < 10; a++) {
			cb.run("Ŭ���� ó�� ����" + a);
		}

		cpu_box cp = null;
		// �����带 �̿��Ͽ� ���� ó���� ��� ������ �������� �մϴ�.
		for (int b = 0; b < 10; b++) {
			cp = new cpu_box("������ ó����Ȳ" + b);
			cp.start();
		}
		//�����带 �̿��� ���� ����ó�� ����̸� ������ �߻� �ϴ���
		//�ش� ������ �߻��� ������ ����ó�� �� �� ������ ��� ó���ϴ� ����
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
