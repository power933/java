package swing1;

public class swing1 {

	public static void main(String[] args) {
		
		//wrapper class(box����)
		//float,char,byte,long,short(�⺻Ÿ��)
		//wrapper class : byte,integer,Long,Double
		int a = new Integer(20);	//��ڽ�
		Integer b = new Integer(20);	//new integer(�ڻ�)
		
		if(a==b) {
			System.out.println(a+b);
		}
		Integer no = new Integer(99); // �ڽ�
		int no1 = no; // ��ڽ�
		Integer bb = no.intValue();// ��ڽ�
		System.out.println(bb);
		
	}

}
