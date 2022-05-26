
public class For1 {

	public static void main(String[] args) {
		
		//구구단 2단부터 3단까지
		int f,ff; //반복문에 사용할 변수 선언을 미리 하였음
		
		for(f=2;f<4;f++) { //큰 for문 2~3까지만 회전함
			for(ff=1;ff<10;ff++) {//작은 for문 1~9까지 회전함
				
				//해당 작은 반복문이 작동할 때 마다 출력을 사용함
				//System.out.println(f+"*"+ff + "=" + f*ff+" ");
			}
		}
		
		//구구단 5단부터 7단까지 출력을 하되 4까지만 연속적으로 나오는 수식구를 출력
		//해당 결과값의 총 합계를 출력하시오
		int sum=0;
		for(int i=5;i<8;i++) {
			
			for(int j=1;j<5;j++) {
				sum += i*j;
			//	System.out.printf("%d * %d = %d %n" ,i,j,i*j);
				
			}
		}System.out.println(sum);
		
		
		
	}

}
