import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

import javax.naming.ldap.SortControl;

public class Example8 {

	public static void main(String[] args) {
		/*
		 	���� ����� ���� ���� ���α׷��� ��û �Ͽ����ϴ�.
		 	����ڰ� �� 5���� ���ڸ� �Է��ϰ� �˴ϴ�.
		 	"1~46�� ������ ���ڸ� �Է����ּ���"
		 	����ڰ� �Է��� 5�� ���ڸ� �迭�� �����մϴ�.(main)���� ó��
		 	
		 	�ܺ� class�� �̿��Ͽ� PC�� ���� ��÷��ȣ 5���� �����ϰ� �̾Ƴ��ϴ�.
		 	pc�� ���� 5���� ���ڸ� �迭�� �����մϴ�. (�ܺ� class �޼ҵ�� ����)
		 	
		 	������ ��� �޼ҵ带 �ϳ� �� �����Ͽ� ����ڰ� �Է��� 5���� �迭 �����Ϳ�
		 	pc�� ���� �迭 �����͸� �ش� �޼ҵ�� �����Ͽ� ����Ͻÿ�.
		 	
		 	�� ��� ����ϴ� �ݺ����� ������ do~while������ �ۼ�
		 	
		 */
		int arr[] = new int[5];
		int i = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("���ڸ� 5�� �Է��ϼ���");
		do{
			int a = sc.nextInt();
			arr[i] = a;
			i++;
		}while(i<5);
		Arrays.sort(arr);
		
		cal cd = new cal();
		cd.make(arr);
		}
	
	
}

class cal{
	int lotto[] = new int[46];
	int tmp[] = new int[5];
	int a = 0;
	
	public void make(int arr[]) {
		int ex[] = new int[5];
		for(int i = 0;i<lotto.length;i++) {
			lotto[i] = i+1;
		}
		for(int i = 0;i<5;i++) {
			a = ((int)(Math.random()*46));
			tmp[i] = lotto[a];
			lotto[a] = lotto[i];
			lotto[i] = tmp[i];
		}
		for(int i = 0;i<5;i++) {
			ex[i] = lotto[i];
		}
		Arrays.sort(ex);
		check(arr,ex);
		
	}
	
	public void check(int ar[], int ar1[]) {
		System.out.println(Arrays.toString(ar));
		System.out.println(Arrays.toString(ar1));
		int count = 0;
		String msg = "";
		for(int i = 0; i<ar.length;i++) {
			for(int j = 0; j<ar.length;j++) {
				if(ar1[i]==ar[j]) {
					count++;
				}
			}
		}
		switch(count) {
		case 0,1-> msg = "������ȸ��";
		case 2-> msg = "4���÷";
		case 3-> msg = "3���÷";
		case 4-> msg = "2���÷";
		case 5-> msg = "1���÷";
		}
		System.out.println(msg);
		}
	
	
}
