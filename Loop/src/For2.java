
public class For2 {

	public static void main(String[] args) {
		
		int a; //for���ʱⰪ
		int b=2; //���꿡  ����� ����
		int c; //���� �����
		
		for(a=1;a<10;a++) {
			c = a*b;	// ������� �۾�
			//System.out.print(c+" "); //����� ������� �����
		}
		//���� ������� ���� �ڵ带 �ۼ��Ͻÿ�. 
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
