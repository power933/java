import java.awt.*;
import java.awt.event.*;

import javax.swing.JOptionPane;

//�ܺ� Ŭ������ awt����
public class awt2 {

	public static void main(String[] args) {
		login lg = new login();

	}

}

class loginok extends login{
	public loginok(){
		this.fr.setTitle("�α��� �� ������");
	}
}

class login {	//������ �߻�Ŭ���� extends�� �ε��Ͽ� �����Ŵ
	Frame fr = new Frame();
	Font ft = new Font("����ü", Font.BOLD, 20); // ("����ü",Font.bold(����ü),����ũ��)
	Button close_btn = new Button("���α׷� ����");
	Button lg_btn = new Button("�α���");
	Button ship_btn = new Button("ȸ������");
	TextField mid = new TextField();
	TextField mpw = new TextField();
	Label msg = new Label("");

	public login() {
		this.fr.setTitle("�α��� �����");
		this.fr.setBounds(0, 0, 400, 400);
		this.fr.setVisible(true);
		this.fr.setLayout(null);
		msg.setBounds(100, 120, 400, 20);
//		msg.setBackground(Color.red);
		mid.setFont(ft);
		mpw.setFont(ft);
		mpw.setEchoChar('*'); // ''�� ���ڷ� �Է¹��� ����(pw)
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

	public void clicks() { // ��ư�� ���� ��� �ڵ鸵,�޼ҵ� ���ռ�
		
		this.ship_btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				fr.setVisible(false); 	//�ش� frame ����
				loginok ok = new loginok(); // ���� frame �ε�
				
			}
		});
		
		this.close_btn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// ���α׷� ���� �ڵ鸵 �̺�Ʈ
				System.exit(0);
			}
		});
		this.lg_btn.addActionListener(new ActionListener() {
			JOptionPane alert = new JOptionPane(); // swing api ��� �ɼ� �ε�

			@Override
			public void actionPerformed(ActionEvent e) {
				// �α��� ��ư ���̵� �� �н����� ����
				String user_id = mid.getText(); // object��.getText(����ڰ� �Է��� ���� �����ö� ���)
				String user_pw = mpw.getText();
				if (user_id.equals("")) { // null��� ���� -> null���� ���� �ִ� ���¸� ����
					msg.setText("���̵� �Է��ϼ���");
//					alert.showMessageDialog(null, "���̵� �Է��ϼ���");
				} else {
					if (user_pw.equals("")) {
						msg.setText("�н����带 �Է��ϼ���");

					} else {
						msg.setText("�α����� ���� �մϴ�");
					}
				}
			}
		});

	}

}
