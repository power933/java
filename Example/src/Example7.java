import java.util.Arrays;

public class Example7 {

	public static void main(String[] args) {
		
		/*
		 	������ �迭�� ���� + �ܺ� class �� �޼ҵ� ���
		 	
		 	[data]
		 	
		 	{"ȫ�浿","�հ�"},
		 	{"�̼���","�հ�"},
		 	{"������","���հ�"},
		 	{"������","�հ�"},
		 	{"������","���հ�"},
		 	{"�庸��","���հ�"}
		 	
		 	������ �迭 �����̸� �ش� ���� �հ��ڸ� ��µǵ��� �մϴ�.
		 	��, �迭���� �ܺ� Ŭ���� �ȿ� �޼ҵ忡�� ó���� �ǵ��� �մϴ�.
		 	��� : ȫ�浿 �̼��� ������
		 */
		
		userlist ul = new userlist();
		ul.re();
		ul = null;
	}

}

class userlist{
	String user_list[][] = {
	{"ȫ�浿","�հ�"},
 	{"�̼���","�հ�"},
 	{"������","���հ�"},
 	{"������","�հ�"},
 	{"������","���հ�"},
 	{"�庸��","���հ�"}
	};
	
	public void re() {
		//String tmp[] = new String[user_list.length];
		int count = 0;
		String a = "";
		for(int i = 0;i<user_list.length;i++) {
				if(user_list[i][1].equals("�հ�")) {
					a += user_list[i][0] + " ";
				}
		}
		String tmp[] = a.split(" ");
		
		for(int i = 0; i<tmp.length;i++) {
			if(tmp[i].equals("�̼���")) {
				System.out.println("1");
			}
			else
				System.out.println("2");
		}
		System.out.println(Arrays.toString(tmp));
	}
	
}