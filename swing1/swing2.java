package swing1;

import java.util.HashMap;
import java.util.Map;

public class swing2 {

	public static void main(String[] args) {
		//ArrayList, LinkedList(배열값)
		//map(배열키,배열값) : 키값을 통해 데이터를 확인 합니다.(속도 제일 빠름)
		//put,remove
		//같은 키를 사용시 마지막에 적용된 값으로 갱신. 키값은 중복안됨
		Map<String,String> m = new HashMap<>();
		//hong -> Hash function(hashMap) - >
		m.put("hong", "홍길동");
		m.put("kang", "강감찬");
		System.out.println(m.get("hong"));
		
		m.put("park","");
		m.put("","1");
		m.put("","2");
		//굳이 빈키값은 지양
		if(m.get("park").equals("")) {	//
			m.put("park", "test");
		}
		System.out.println(m.get("park"));
		System.out.println(m);
		
		Map<String, Integer> m2 = new HashMap<>();
		m2.put("age", 32);
		m2.put("level",5);
		System.out.println(m2.keySet());
		System.out.println(m2.values());
		System.out.println(m2.containsKey("tel"));
		
		
	}

}
