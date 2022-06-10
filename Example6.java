import java.util.Scanner;

public class Example6 {

	public static void main(String[] args) {
		
		/*
		 	상품가격은 42000원 입니다.
		 	사용자가 해당 상품을 갯수를 입려갛게 됩니다
		 	해당 상품 가격에 맞는 갯수 만큼 곱하여 최종 결제 금액을
		 	출력시키는 extends를 제작하시면 됩니다
		 	단 , 42000은 절대 숫자가 바뀌면 안됩니다.
		 	사용자가 최대 구매할 수 있는 갯수는 5개 입니다.
		 	최종결과 값은 main.메소드에서 출력
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("구매 갯수 입력");
		int a1 = sc.nextInt();
		
		res r = new res();
		r.resu(a1);
		System.out.println(r.res1());
	}

}

class list{
	private int goods = 42000;
	protected int sum = 0;
	int x = 0;
	public void resu(int a) {
		this.x = a;
		 sum = a*this.goods;
	}
}
class res extends list{
	public String res1() {
		String msg = "";
		if(this.x>5) {
			msg = "5개까지만 구매 가능합니다";
		}
		else {
			msg = String.valueOf(sum);
		}
		return msg;
	}
	
	
}