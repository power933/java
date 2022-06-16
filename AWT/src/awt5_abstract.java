import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//AWT ȯ�漳��
public abstract class awt5_abstract {

	public abstract String signok();	//getter
	public abstract void idcheck(String id);	//setter
	public abstract void dataload();	
	Frame fr = new Frame();
	Button bt = null;
	Button close = null;
	TextField mid = null;
	Label msg = new Label();
	
	public void design() {
		this.fr.setBounds(200,200,300,450);
		this.fr.setLayout(null);
		this.fr.setVisible(true);
		this.bt = new Button("�ߺ�üũ");
		this.close = new Button("����");
		this.mid = new TextField();
		this.msg.setBackground(Color.LIGHT_GRAY);
		this.msg.setBounds(25,200,250,25);
		this.mid.setBounds(25,150,170,25);
		this.bt.setBounds(200,150,80,25);
		this.close.setBounds(200,400,80,25);
		
		this.fr.add(this.msg);
		this.fr.add(bt);
		this.fr.add(mid);
		this.fr.add(close);
		
		this.click();	//awt ������ �Ϸ� �� �ش� �ڵ鸵 �޼ҵ�� �̵�.
		
	}
	
	public void click() {
//		settext(���), getText(�Է°� ��������)
		bt.addActionListener(new ActionListener() {	//�ߺ�Ȯ��
			@Override
			public void actionPerformed(ActionEvent e) {
				String userid = awt5_abstract.this.mid.getText();
				
				if(userid.equals("")) {
					msg.setText("���̵� �Է��ϼ���");
				}
				else {
					idcheck(userid);
					String result = signok();
					if(result == null) {
						msg.setText("��밡���� ���̵� �Դϴ�");
					}
					else {
						msg.setText("�ٸ� ���̵� �Է��� �ֽʽÿ�");
					}
				}
			}
		});
		
		close.addActionListener(new ActionListener() {	//�����ư
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
	}
	
}



