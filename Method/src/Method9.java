import java.util.Arrays;

public class Method9 {

	public static void main(String[] args) {
		
		/*
		 	�����ڿ��� �޴��� Ȱ��ȭ �ϴ� ���μ��� �Դϴ�
		 	�ش� �޴� Ȱ��ȭ�� 2�� �迭�̸� �޴��� Ȱ��ȭ�� (Y/N) �����մϴ�.
		 	�ش� Ȱ��ȭ ���� �����Ͽ� Y�� ����Ǵ� �ε��� ��ȣ�� �´� �޴����� 1�� �迭�� �籸�� ��
		 	���ο��� ��µǵ��� �մϴ�
		 	��� : ["���Ϲ��","����������","",]
		 */
		
		menus me = new menus();
		System.out.println(Arrays.toString(me.list()));
		
	}

}

class menus{
	private String ms1[][];
	
	public menus() {
		String ms[][] = {
				{"���Ϲ��","����������","���κ���","���ڽ�","�̺�Ʈ","����","�߼�"},
				{"Y","Y","N","Y","Y","N","Y"}
		};
		this.ms1 = ms;
	}
	public String[] list() {
		int count = 0;
		String tmp[] = new String[this.ms1[0].length];
		for(int i = 0; i<this.ms1[0].length;i++) {
			if(this.ms1[1][i].equals("Y")) {
				tmp[count] = this.ms1[0][i];
				count++;
			}
		}
		return tmp;
	}
	
	
}

/*
 	class aaa{
 		int a;   -> field
 		String b ;
 			public aaa(){ -> constructor
 			
 			}
 			
 			public void wer(){ -> method
 			
 			}
 	}
  
 */
