import java.util.*;

public class Solution {
	
	public String solution(String s) {
		String answer = "";
		int a = s.length();
		String arr[] = new String[s.length()];
		arr = s.split("");
		if(a%2==0) {
			answer = arr[s.length()/2-1] + arr[s.length()/2];
		}
		else {
			answer = arr[s.length()/2];
		}
		
        
        return answer;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
