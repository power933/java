
public class For_plus {

	public static void main(String[] args) {
		// 1부터 10까지 모든 숫자를 합한 결과값을 출력하시오
		
		int f;
		int total = 0;
		for(f=1;f<11;f++) { //total 변수값에 반복값을 지속적으로 증가시킴
			//total = total+ f;
			total+=f;
		}
		//System.out.println(total);
		// += : 더하기 할당 기호  -= : 빼기 할당 기호 *=,/= 
		
		/*전체값은 500이 있습니다.
		 * 총 8회동안 반복되면서 한번 반복할 때 마다 12씩 감소하도록 하여
		 * 최종값을 출력하시오
		 */
		int sum = 500;
		for(int i = 0;i<8;i++) {
			sum-=12;
		}
		System.out.println(sum);
		
		//구구단 2단 2*1~2*9까지의 총 합계
		int sum1 = 0;
		for(int a = 1; a<10;a++) {
			sum1+=2*a;
		}System.out.println(sum1);
	}

}
