import java.util.Arrays;

public class Arrays4 {

	public static void main(String[] args) {
		
		String[] names = new String[3]; //값이 없는 배열
		String m[] = {"홍길동","이순신","강감찬"}; //배열값에 데이터가 있는 상태
		
		int ct = 0; //foreach엔 인덱스 번호 없으므로 새로 지정
		for(String a : m) { //String a : a의 주소내의 값을 출력, m = 주소, 배열 길이만큼 돌아감
//			System.out.println(1);
			
			if(a.equals("홍길동")|| a.equals("강감찬")) { // 해당 배열값중 (기존)배열값중 조건에 맞는 값만 추려서 새로운 배열에 추가
				names[ct] = a;
				ct++; // 인덱스 번호를 순차적으로 적용하기 위한 증가값
				
			}
			
		}
//		System.out.println(Arrays.toString(names));
		
		
		/*
		 	사용자가 장바구니에 내용을 결제 하게 됩니다.
		 	단, 해당 금액리스트를 출력하지 말고 최종 전체 결제 금액만 출력되도록 합니다
		 	1500 22000 13000 14500 113800 45000
		 */
		int[] arr = {1500,22000,13000,14500,113800,45000};
		int total = 0;
		
		for(int i = 0; i<arr.length;i++) {
			total +=arr[i];
		}
		System.out.println(total);
	}

}
