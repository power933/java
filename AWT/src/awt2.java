import java.awt.*;
import java.awt.event.*;

import javax.swing.JOptionPane;

//외부 클래스로 awt생성
public class awt2 {

	public static void main(String[] args) {
		login lg = new login();

	}

}

class loginok extends login{
	public loginok(){
		this.fr.setTitle("로그인 후 페이지");
	}
}

class login {	//원래는 추상클래스 extends로 로드하여 적용시킴
	Frame fr = new Frame();
	Font ft = new Font("돋움체", Font.BOLD, 20); // ("글자체",Font.bold(굵은체),글자크기)
	Button close_btn = new Button("프로그램 종료");
	Button lg_btn = new Button("로그인");
	Button ship_btn = new Button("회원가입");
	TextField mid = new TextField();
	TextField mpw = new TextField();
	Label msg = new Label("");

	public login() {
		this.fr.setTitle("로그인 만들기");
		this.fr.setBounds(0, 0, 400, 400);
		this.fr.setVisible(true);
		this.fr.setLayout(null);
		msg.setBounds(100, 120, 400, 20);
//		msg.setBackground(Color.red);
		mid.setFont(ft);
		mpw.setFont(ft);
		mpw.setEchoChar('*'); // ''내 문자로 입력문자 숨김(pw)
		mid.setBounds(100, 80, 200, 40);
		mpw.setBounds(100, 140, 200, 40);
		lg_btn.setBounds(100, 200, 200, 40);
		ship_btn.setBounds(100, 260, 200, 40);
		close_btn.setBounds(100, 320, 200, 40);
		this.fr.add(mid);
		this.fr.add(mpw);
		this.fr.add(lg_btn);
		this.fr.add(ship_btn);
		this.fr.add(this.close_btn);
		this.fr.add(msg);
		this.clicks();

	}

	public void clicks() { // 버튼에 관한 모든 핸들링,메소드 집합소
		
		this.ship_btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				fr.setVisible(false); 	//해당 frame 종료
				loginok ok = new loginok(); // 다음 frame 로드
				
			}
		});
		
		this.close_btn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// 프로그램 종료 핸들링 이벤트
				System.exit(0);
			}
		});
		this.lg_btn.addActionListener(new ActionListener() {
			JOptionPane alert = new JOptionPane(); // swing api 경고 옵션 로드

			@Override
			public void actionPerformed(ActionEvent e) {
				// 로그인 버튼 아이디 및 패스워드 검토
				String user_id = mid.getText(); // object명.getText(사용자가 입력한 값을 가져올때 사용)
				String user_pw = mpw.getText();
				if (user_id.equals("")) { // null사용 금지 -> null또한 값이 있는 상태를 말함
					msg.setText("아이디를 입력하세요");
//					alert.showMessageDialog(null, "아이디를 입력하세요");
				} else {
					if (user_pw.equals("")) {
						msg.setText("패스워드를 입력하세요");

					} else {
						msg.setText("로그인을 진행 합니다");
					}
				}
			}
		});

	}

}
