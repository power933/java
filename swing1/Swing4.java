package swing1;

import java.io.*;
import java.util.HashMap;

public class Swing4 {

	public static void main(String[] args) {
		
		String[][] data = {
				{"d1","123456"},
				{"d1","456789"},
				{"d2","ȫ�浿"},
				{"d2","�̼���"},
				{"d3","hong@naver.com"}
		};
		
		HashMap m = new HashMap<>();
//		Map m2 = new HashMap<>();  ������ �ڷ����� ���� ����
		for(int a = 0; a<data.length;a++) {
			if(!m.containsKey(data[a][0]))
				m.put(data[a][0], data[a][1]);
			else
				m.put(data[a][0]+a, data[a][1]);
		}
		System.out.println(m);
	}

}
