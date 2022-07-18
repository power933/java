
public class thread2 {
	public static void main(String[] args) {
		/*
		 	쓰레드를 이용하여 각 배열의 값을 내림차순으로 모두 더하여
		 	결과로 출력하는 응용 프로그램을 제작하시오
		 */
		int data[] = {6,9,10,15,3,17};
		// 6 이라는 배열값이 인수값으로 쓰레드에 전달, 6+5+4+3+2+1, 최종 결과값만 프린트
		
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
	public void run() {	//run은 인수값을 받지 못함
		int sum = 0;
		for(int i = a; i>0;i--) {
			sum += i;
		}
		System.out.println(sum);
	}
}