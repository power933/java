
public class do1 {

	public static void main(String... args) {
		
		int a = 1; //초기값
		do {
		//	System.out.print(a+" ");
			a++; //증가
		}while(a < 11); //범위값
		
		//5~0까지 출력
		
		int i = 5;
		do {
			System.out.println(i);
			i--;
		}while(i>=0);
		
		int c = 50; //기초값
		int d = 60; //종료값
		
		do {
			System.out.print(c +" ");
			c++;
		}while(c<=d);
	}

}
