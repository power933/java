
public class Example5 {

	public static void main(String[] args) {
		
		/*
		 	extends�� ����Ͽ� ���� ����� ���� �ڵ带 �ۼ��Ͻÿ�.
		 	���� �ΰ��� �Է��մϴ�.
		 	�ΰ��� ���ڸ� Ȯ���Ͽ� ������ ���� üũ �մϴ�.
		 	ù��° ���ڰ� �ι�° ���ں��� ���� ���
		 	ù��° ���ڰ� �ι�° ���ں��� Ŭ ���
		 	ù��° ���ڰ� �ι�° ���ڿ� ���� ���
		 	
		 	ù��° ���ڰ� ���� ��� : �ش� �ΰ��� ���� ��ģ ����� ���
		 	�ι�° ���ڰ� ���� ��� : �ش� ���� ��ŭ ���ڸ� ��� ���� ������� ���
		 	ù��°�� �ι�° ���ڰ� ���� ��� : "�ش簪�� �����ϴ�" ��� �޼��� ��� 
		 */
		int aa = 10;
		int bb = 1;
		ex4 e = new ex4();
		e.ex3_1(aa, bb);
		System.out.println(e.ex4_1());
		System.exit(0);
	}
}

class ex3{
	protected int c,x,y;
	
	public void ex3_1(int a , int b) {
		this.x = a;
		this.y = b;
		if(a == b) {
			this.c = 0;
		}
		else if(a>b) {
			this.c = 1;
		}
		else {
			this.c = 2;
		}
	}
}

class ex4 extends ex3{
	public String ex4_1() {
		int sum = 0;
		String result = "";
		if(this.c == 0) {
			result = "�� ���� �����ϴ�";
		}
		else if(this.c ==1) {
			for(int i = this.y; i<this.x+1;i++) {
				sum += i;
				result = String.valueOf(sum);
		}
		}
		else {
			sum = this.x + this.y;
			result = String.valueOf(sum);
		}
		
		
		return result;
	}
}
