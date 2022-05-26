
public class If {

	public static void main(String[] args) {
		
		final int a = 1; // final을 사용 시 변수 > 상수로 변경
		//final 사용시 절대 바뀌지 않는 상수값으로 변경
		
		final String name = "홍길동";
		//System.out.println(a); 
		
		final int ct = 102; //고정값
		int f; //반복문
		boolean ok = false; // 조건에 대한 true, false;
		/*for(f=1;f<101;f++) {
			
			if(f==ct) { //반복문 값과 고정값이 같을 경우
				System.out.println("등록된 값이 확인 되었습니다");
				ok = true; //조건에 대한 값을 변경
			}
		}if(ok==false) { //만약에 반복문이 끝났는데도 반복문 안에 조건 사항이 없을 경우 출력되는 코드
			System.out.println("등록되지 않은 값입니다");
		}*/
		
		//20번을 반복, 그 중 홀수값만 출력하도록
		int ff;
		String odd ="";	//odd 홀수 even 짝수
		for(ff=0;ff<20;ff++) {
			if(ff%2==1) {
				System.out.print(ff+" ");
			}
			else { // 만약에 홀수 값일 경우 odd변수에 지속적으로 값을 추가 하게 됩니다.
				odd+=ff+" ";
				
			}
		}System.out.printf("%n%s" ,odd);
	}

}
