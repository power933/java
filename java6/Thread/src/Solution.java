import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class Solution {
	public String solution(String[] participant, String[] completion) {

		Map<String, Integer> m = new HashMap<>();
		String name = "";
		int count;
		for(int i = 0; i<participant.length;i++) {
			count = 1;
			name = participant[i];
			if(m.containsKey(name)) {
				m.put(name, count++);
			}
		}
		
		String a = "";
		return a;
	}

	public static void main(String[] args) {

		Solution s = new Solution();

		String a[] = { "mislav", "stanko", "mislav", "ana" };
		String b[] = { "stanko", "ana", "mislav" };
		System.out.println(s.solution(a, b));

	}

}
