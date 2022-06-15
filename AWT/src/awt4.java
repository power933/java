
public class awt4 {

	public static void main(String[] args) {
		//awt4_class.java ¿¬°è
		decorate de = new decorate();
		de.view();
		
	}

}

class decorate extends awt4_class{
	String gugu = "";
	public void btn_push(int c) {
		for(int i = 1;i<10;i++) {
			gugu += c + "*" + i + "=" + c*i +  "\n";
		}
	}
	public String calls() {
		return this.gugu;
	}
}



