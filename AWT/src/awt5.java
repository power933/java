import java.util.ArrayList;
import java.util.*;

//�ߺ� ���̵� üũ �ý��� : awt5_abstract �� �Բ� ���
//ȸ�� ������ : hong,lee,park
public class awt5 {

	public static void main(String[] args) {
		
		
		handel hd = new handel();
		hd.design();
		
	}

}

class handel extends awt5_abstract{
	private String aid = "";	//db���� �Ѿ�� �μ����� Ŭ�������� Ȱ��
	private String return_id;	//awt�� �ٽ� ���� �����ϴ� ���� ����  
	//null�ϰ�� : ���̵� ��밡��, id���� ���� : �ش���̵�� ���� �� ����
	ArrayList<String> db;
	
	@Override
	public void idcheck(String id){
		this.return_id = null;	//awt���� �ߺ���ư�� Ŭ���� �ش� ������ ���������� �ʱ�ȭ �ϴ� ����.
		this.aid = id;
		this.dataload();	//���������� �����Ͱ� �Ѿ� ���� ��� db�� �ε��Ͽ� Ȯ���ϰ� ��
		int ea = this.db.size();
		int w = 0;
		while(w<ea) {
			if(this.aid.equals(this.db.get(w))) {
				this.return_id = this.db.get(w);
				break;
			}
			w++;
		}
	}
	@Override
	public String signok() {
		
		return this.return_id;
	}
	
	@Override
	public void dataload() {
		String ori[] = {"hong","lee","park","jung","kim"};
		this.db = new ArrayList<>(Arrays.asList(ori));
		
	}
	
}