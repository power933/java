
public class If_dowhile1 {

	public static void main(String[] args) {

	//������ 6�� �߿��� 35�̻� ������ڸ� ���
		
		int a = 1;
		int total;
		do{
			total = a*6;
			if(total>34) {
				//System.out.println(total);
			}
			a++;
		}while(a<10);
		
		//14~27���� ������ ¦������ ��� ���Ͽ� ����� ���
		
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
