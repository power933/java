
public class thread2 {
	public static void main(String[] args) {
		/*
		 	�����带 �̿��Ͽ� �� �迭�� ���� ������������ ��� ���Ͽ�
		 	����� ����ϴ� ���� ���α׷��� �����Ͻÿ�
		 */
		int data[] = {6,9,10,15,3,17};
		// 6 �̶�� �迭���� �μ������� �����忡 ����, 6+5+4+3+2+1, ���� ������� ����Ʈ
		
//		long stime = System.currentTimeMillis();
//		System.out.println(stime);
		for(int i = 0; i<data.length;i++) {
			add a = new add(data[i]);
			a.start();
		}
		long etime = System.currentTimeMillis();
//		System.out.println(etime);
//		System.out.print(etime-stime + " : time");
	}
}

class add extends Thread{
	int a = 0;
	add(int a){
		this.a = a;
	}
	@Override
	public void run() {	//run�� �μ����� ���� ����
		int sum = 0;
		for(int i = a; i>0;i--) {
			sum += i;
		}
		System.out.println(sum);
	}
}