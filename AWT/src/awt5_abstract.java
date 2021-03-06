import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//AWT 환경설정
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
		this.bt = new Button("중복체크");
		this.close = new Button("종료");
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
		
		this.click();	//awt 디자인 완료 후 해당 핸들링 메소드로 이동.
		
	}
	
	public void click() {
//		settext(출력), getText(입력값 가져오기)
		bt.addActionListener(new ActionListener() {	//중복확인
			@Override
			public void actionPerformed(ActionEvent e) {
				String userid = awt5_abstract.this.mid.getText();
				
				if(userid.equals("")) {
					msg.setText("아이디를 입력하세요");
				}
				else {
					idcheck(userid);
					String result = signok();
					if(result == null) {
						msg.setText("사용가능한 아이디 입니다");
					}
					else {
						msg.setText("다른 아이디를 입력해 주십시오");
					}
				}
			}
		});
		
		close.addActionListener(new ActionListener() {	//종료버튼
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
	}
	
}



