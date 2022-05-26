import java.util.Arrays;

public class Test {

	public static void main(String[] args) {
		
		String[] a = new String[3];
	      
	      a[1] = "+";
	      a[2] = "b";
	      
	      for(int i =0;i<a.length;i++) {
	      //   System.out.println(a[i]);
	      }
	      if(a[1]=="+") {
	         System.out.println("ok");
	      }
	      System.out.println(Arrays.toString(a));
	   }
		
	}

