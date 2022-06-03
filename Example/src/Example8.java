import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

import javax.naming.ldap.SortControl;

public class Example8 {

	public static void main(String[] args) {
		/*
		 	다음 사용자 복권 관련 프로그램을 요청 하였습니다.
		 	사용자가 총 5개의 숫자를 입력하게 됩니다.
		 	"1~46번 사이의 숫자를 입력해주세요"
		 	사용자가 입력한 5개 숫자를 배열로 생성합니다.(main)에서 처리
		 	
		 	외부 class를 이용하여 PC가 직접 당첨번호 5개를 랜덤하게 뽑아냅니다.
		 	pc가 뽑은 5개의 숫자를 배열로 생성합니다. (외부 class 메소드로 생성)
		 	
		 	별도의 결과 메소드를 하나 더 생성하여 사용자가 입력한 5개의 배열 데이터와
		 	pc가 뽑은 배열 데이터를 해당 메소드로 전달하여 출력하시오.
		 	
		 	단 모든 사용하는 반복문은 무조건 do~while문으로 작성
		 	
		 */
		int arr[] = new int[5];
		int i = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 5개 입력하세요");
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
		case 0,1-> msg = "다음기회에";
		case 2-> msg = "4등당첨";
		case 3-> msg = "3등당첨";
		case 4-> msg = "2등당첨";
		case 5-> msg = "1등당첨";
		}
		System.out.println(msg);
		}
	
	
}
