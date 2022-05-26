
public class If_dowhile1 {

	public static void main(String[] args) {

	//구구단 6단 중에서 35이상 결과숫자만 출력
		
		int a = 1;
		int total;
		do{
			total = a*6;
			if(total>34) {
				//System.out.println(total);
			}
			a++;
		}while(a<10);
		
		//14~27까지 숫자중 짝수값만 모두 더하여 결과값 출력
		
		int b = 14;
		int t = 0;
		do {
			if(b%2==0) {
				t+=b;
			}
			b++;
		}while(b<28);
		System.out.println(t);
	}

}
