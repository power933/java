
public class If {

	public static void main(String[] args) {
		
		final int a = 1; // final�� ��� �� ���� > ����� ����
		//final ���� ���� �ٲ��� �ʴ� ��������� ����
		
		final String name = "ȫ�浿";
		//System.out.println(a); 
		
		final int ct = 102; //������
		int f; //�ݺ���
		boolean ok = false; // ���ǿ� ���� true, false;
		/*for(f=1;f<101;f++) {
			
			if(f==ct) { //�ݺ��� ���� �������� ���� ���
				System.out.println("��ϵ� ���� Ȯ�� �Ǿ����ϴ�");
				ok = true; //���ǿ� ���� ���� ����
			}
		}if(ok==false) { //���࿡ �ݺ����� �����µ��� �ݺ��� �ȿ� ���� ������ ���� ��� ��µǴ� �ڵ�
			System.out.println("��ϵ��� ���� ���Դϴ�");
		}*/
		
		//20���� �ݺ�, �� �� Ȧ������ ����ϵ���
		int ff;
		String odd ="";	//odd Ȧ�� even ¦��
		for(ff=0;ff<20;ff++) {
			if(ff%2==1) {
				System.out.print(ff+" ");
			}
			else { // ���࿡ Ȧ�� ���� ��� odd������ ���������� ���� �߰� �ϰ� �˴ϴ�.
				odd+=ff+" ";
				
			}
		}System.out.printf("%n%s" ,odd);
	}

}
