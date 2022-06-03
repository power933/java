
public class Example1 {

	public static void main(String[] args) {
		
		/*
		 	배열 + 메소드
		 	배열 리스트 22 33 44 55 66 77 88 99 이며
		 	해당 전체값을 모두 더한 총 합계값을 별도의 메소드로
		 	처리되도록 합니다 단 반복문은 무조건 do-while로 작성
		 */
		int arr[] = {22,33,44,55,66,77,88,99};
		Example1 ex = new Example1();
		ex.datas(arr);
		//void면 : 객체생성 + 인스턴스(메모리)등록
	}
	
	public void datas(int arr1[]) {
		int i = 0;
		int sum = 0;
		do {
			sum+=arr1[i];
			
			i++;
		}while(i<arr1.length);
		
		System.out.println(sum);
		
		
	}

}
