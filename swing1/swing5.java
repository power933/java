package swing1;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class swing5 extends JFrame {

	private JPanel contentPane;
	private JTextField mid;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					swing5 frame = new swing5();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public swing5() {
		/*
		 	Frame absolute 형태로 layer을 변경합니다.
		 */
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel msg = new JLabel("");
		msg.setBorder(new LineBorder(Color.RED));
		msg.setBounds(37, 131, 364, 15);
		contentPane.add(msg);
		
		//핸들링 클래스가 오브젝트 보다 상위코드에 있으면 해당 오브젝트를 로드하지 못합니다.
		JButton btnNewButton = new JButton("\uC544\uC774\uB514 \uCCB4\uD06C");
		btnNewButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(mid.getText().equals("")) {
					msg.setText("아이디를 입력하세요");
				}
				else {
					int lg = mid.getText().length();	//입력 문자 갯수
					if(lg < 5) {
						msg.setText("아이디는 다섯자 이상 사용 가능");
					}
					else {
						msg.setText("아이디 검토 중입니다...");
					}
				}
			}
		});
		btnNewButton.setFont(new Font("돋움체", Font.PLAIN, 10));
		btnNewButton.setBackground(Color.LIGHT_GRAY);
		btnNewButton.setBounds(146, 81, 93, 23);
		contentPane.add(btnNewButton);
		
		mid = new JTextField();
		mid.setBounds(126, 48, 122, 23);
		contentPane.add(mid);
		mid.setColumns(10);
		
		
	}
}
