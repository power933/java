
public class For1 {

	public static void main(String[] args) {
		
		//������ 2�ܺ��� 3�ܱ���
		int f,ff; //�ݺ����� ����� ���� ������ �̸� �Ͽ���
		
		for(f=2;f<4;f++) { //ū for�� 2~3������ ȸ����
			for(ff=1;ff<10;ff++) {//���� for�� 1~9���� ȸ����
				
				//�ش� ���� �ݺ����� �۵��� �� ���� ����� �����
				//System.out.println(f+"*"+ff + "=" + f*ff+" ");
			}
		}
		
		//������ 5�ܺ��� 7�ܱ��� ����� �ϵ� 4������ ���������� ������ ���ı��� ���
		//�ش� ������� �� �հ踦 ����Ͻÿ�
		int sum=0;
		for(int i=5;i<8;i++) {
			
			for(int j=1;j<5;j++) {
				sum += i*j;
			//	System.out.printf("%d * %d = %d %n" ,i,j,i*j);
				
			}
		}System.out.println(sum);
		
		
		
	}

}
