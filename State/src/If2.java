import java.util.Arrays;

public class If2 {

	public static void main(String[] args) {
		String mid1 = "hong", mid2 = "kim", mpass = "a123456",mid3 = "";
		
		//�ش� ���ǹ��� ���ڷ� Ȯ���ϴ� ���� ���� �̸�, else���� ������
		if(mid1 == "hong") {
			System.out.println("ȯ���մϴ�");
		}
		else if (mid1=="park") { //�߰��� �� ����� ���� ���
			System.out.println("ȯ���մϴ�.");
		}
		else {
			System.out.println("���Ե��� ���� ����� �Դϴ�.");
		}

		//id �� �н����带 ��� �����ϴ� ��������
		if(mid2=="kim") {
			if(mpass =="a123456") {
				System.out.println("�α����ϼ̽��ϴ�.");
			}
			else {
				System.out.println("�н����尡 Ʋ���ϴ�");
			}
		}
		else {
			System.out.println("���Ե��� ���� ������Դϴ�.");
		}
		

		
		String[] str = {"1","hong","3"};
		for (int i =0; i<=2;i++) {
			mid3 = str[i];
			if(mid1==mid3) { //mid1 = hong
				System.out.println("ok");
			}
		}
		String[] str1 = {"1","2",""};
		for(int i =0; i<=2; i++) {
			str1[i] = str[i];
			System.out.println(str1[i]);
		}
		/*
		int count = 1;
		
		int[] arr1 = {1,2,3};
		for(int i = 0; i<=2;i++) {
			
			if(arr1[i]%2 ==0) {

				count = count++;
				int[] x1 = new int[count];
				x1[count] = arr1[i]; 
				System.out.println(Arrays.toString(x1));
			}
		}*/
		
		
		
		
	}
	
	

}
