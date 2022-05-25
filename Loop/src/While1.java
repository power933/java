
public class While1 {

	public static void main(String[] args) {
		int a = 1; // while 시작값
		while (a < 11) { // while 범위,종료값
		//	System.out.print(a);
			a++; // 증감
		}
		int b = 10;
		while (b > 4) {
		//	System.out.println(b+ " ");
			b--;
		}
		//22~16 까지 출력
		int c = 22;
		while(c > 15) {
		//	System.out.print(c+" ");
			c--;
		}
		
		int aa=1;		//초기값
		int bb=10;		//종료값
		while(aa <= bb) {  //범위
		//	System.out.print(aa+" ");
			aa++;		//증가
		}
		
		//변수는 2개, 범위에 맞게 값을 출력
		//99~47
		int i = 99;
		int j = 46;
		while(i>j) {
			System.out.print(i+" ");
			i--;
		}
		
		
	}

}
