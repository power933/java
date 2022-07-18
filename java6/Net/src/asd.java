import java.util.ArrayList;

public class asd {
	
	ArrayList<Integer> al = new ArrayList<>();
	public asd() {
		for(int i = 0; i<5;i++) {
			int a = (int)(Math.random()*10);
			Object o =name(a) ? i-- : al.add(a);
		}
		System.out.println(al);
	}
	
	public boolean name(int a ) {
		if(al.contains(a)) {
			return true;
		}
		else {
			return false;
		}
		
		
	}
	
	public static void main(String[] args) {
		asd a = new asd();
	}
}
