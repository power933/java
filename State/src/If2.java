import java.util.Arrays;

public class If2 {

	public static void main(String[] args) {
		String mid1 = "hong", mid2 = "kim", mpass = "a123456",mid3 = "";
		
		//해당 조건문은 문자로 확인하는 조건 형태 이며, else문만 적용함
		if(mid1 == "hong") {
			System.out.println("환영합니다");
		}
		else if (mid1=="park") { //추가로 비교 대상이 있을 경우
			System.out.println("환영합니다.");
		}
		else {
			System.out.println("가입되지 않은 사용자 입니다.");
		}

		//id 및 패스워드를 모두 검토하는 더블조건
		if(mid2=="kim") {
			if(mpass =="a123456") {
				System.out.println("로그인하셨습니다.");
			}
			else {
				System.out.println("패스워드가 틀립니다");
			}
		}
		else {
			System.out.println("가입되지 않은 사용자입니다.");
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
