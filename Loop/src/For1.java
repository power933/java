
public class For1 {

	public static void main(String[] args) {
		//반복문 : 데이터를 일괄적으로 입력 또는 출력을 할 수 있도록 하는 문법
		//for(초기값;범위값;증감)
		int z = 99;
		z++; // 출력 후 증가
		z--; // 출력 후 감소
		++z; // 증가 후 출력
		--z; // 감소 후 출력
		//System.out.println(z);
		
		
		for(int a=0; a<2; ++a) {
			//System.out.println(a);
		}
		int b;
		for(b=5;b<=10;b++) {
			//System.out.println(b);
		}
		
		int c;
		for(c=10;c>=4;c--) { // 주의사항 : 특히 감소일때 범위 부등호 잘 보고 설정할것(루프돌 수 있음)
			//System.out.println(c);
		}
		int d;
		for(d=20; d<28;d++) {
			//System.out.print(d+" ");
		}
		int e;
		for(e=39; e>20;e--) {
		//	System.out.print(e+" ");
		}
		int aa;
		int bb=10;
		for(aa=1;aa<=bb;aa++) {
			//System.out.print(aa+" ");
		}
		int i, j=4;
		for(i=55;i>=j;i-- ) {
			System.out.print(i+" ");
		}
	}

}
