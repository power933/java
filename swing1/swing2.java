package swing1;

import java.util.HashMap;
import java.util.Map;

public class swing2 {

	public static void main(String[] args) {
		//ArrayList, LinkedList(�迭��)
		//map(�迭Ű,�迭��) : Ű���� ���� �����͸� Ȯ�� �մϴ�.(�ӵ� ���� ����)
		//put,remove
		//���� Ű�� ���� �������� ����� ������ ����. Ű���� �ߺ��ȵ�
		Map<String,String> m = new HashMap<>();
		//hong -> Hash function(hashMap) - >
		m.put("hong", "ȫ�浿");
		m.put("kang", "������");
		System.out.println(m.get("hong"));
		
		m.put("park","");
		m.put("","1");
		m.put("","2");
		//���� ��Ű���� ����
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
