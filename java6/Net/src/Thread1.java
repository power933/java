
public class Thread1 {
	public static void main(String[] args) {
		int w = 0;
		while(w<6) {
			box b = new box(w);
			Thread t = new Thread(b);
		t.start();
		w++;
		}
		
		for(int i = 0; i<10;i++) {
			Thread t2 = new Thread(new box2(i));	//������ �޼ҵ带 ȣ���Ͽ� �ش� Ŭ������ ������ �ϳ��� �Ҵ���
			t2.start();
		}
	}
}
//extends
class box extends Thread{
	int no = 0;
	public box(int a) {
		no = a;
	}
	@Override
	public void run() {
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		System.out.println(no);
		
	}
}

class box2 implements Runnable{
	int no = 0;
	public box2(int b) {
		no = b;
	}
	@Override
	public void run() {
		try {
			Thread.sleep(1000);
			System.out.println(no);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}


