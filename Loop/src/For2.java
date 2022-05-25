
public class For2 {

	public static void main(String[] args) {
		
		int a; //for문초기값
		int b=2; //연산에  사용할 변수
		int c; //연산 결과값
		
		for(a=1;a<10;a++) {
			c = a*b;	// 산술연산 작업
			//System.out.print(c+" "); //연산된 결과값을 출력함
		}
		//다음 결과값을 보고 코드를 작성하시오. 
		//45,40,35,30,25,20
		
		int i; int j =5;
		for(i=9;i>3;i--) {
			//System.out.print(i*j + ",");
		}
		
		/*
		 * 11,22,33,44,55,66,77,88,99
		 */
		int a1;
		for(a1=1;a1<10;a1++) {
			if(a1==9) {
				System.out.println(a1*11);
			}else
				System.out.print(a1*11+",");
		}
		
		
	}

}
