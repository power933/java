
public class Test {

	char[] at (String str) {
		
		char att[] = new char[str.length()];
		for(int i = 0; i<str.length();i++) {
			att[i] = str.charAt(i);
		}
		
		return att;
	}

}
