package swing1;

public class swing1 {

	public static void main(String[] args) {
		
		//wrapper class(box»óÅÂ)
		//float,char,byte,long,short(±âº»Å¸ÀÔ)
		//wrapper class : byte,integer,Long,Double
		int a = new Integer(20);	//¾ð¹Ú½Ì
		Integer b = new Integer(20);	//new integer(¹Ú»ó)
		
		if(a==b) {
			System.out.println(a+b);
		}
		Integer no = new Integer(99); // ¹Ú½Ì
		int no1 = no; // ¾ð¹Ú½Ì
		Integer bb = no.intValue();// ¾ð¹Ú½Ì
		System.out.println(bb);
		
	}

}
