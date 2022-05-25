import java.util.Arrays;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		
		System.out.print("숫자 몇개 넣으쉴? : ");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int count = 0;
		int arr[] = new int[a];
		int arr1[] = new int[a];
		
		
		for(int i = 0; i<a; i++) {
			System.out.printf("%d번째 숫자를 입력하세요", i+1);
			arr[i] = sc.nextInt();
			if(arr[i]%2 == 0) {
				count++;
				arr1[i] = arr[i];
			}
		}
		int arr2[] = new int[count];
		
		System.out.println(count);
		System.out.println(Arrays.toString(arr1));
		System.out.println(arr2.length);
		
		
		
	}

}
