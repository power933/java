package swing1;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.ActionEvent;

public class swing6 extends JFrame {

	private JPanel contentPane;
	private JTextField tel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					swing6 frame = new swing6();
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
	public swing6() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		tel = new JTextField();
		tel.setFont(new Font("\uB3CB\uC6C0\uCCB4", tel.getFont().getStyle(), tel.getFont().getSize()));
		tel.setBounds(20, 23, 204, 21);
		contentPane.add(tel);
		tel.setColumns(10);
		
		JButton btnNewButton = new JButton("\uC778\uC99D\uBC88\uD638 \uBC1C\uC1A1");
		
		btnNewButton.setBounds(255, 22, 132, 23);
		contentPane.add(btnNewButton);
		
		JLabel msg = new JLabel("");
		msg.setBorder(new LineBorder(new Color(0, 0, 0)));
		msg.setBounds(26, 65, 384, 15);
		contentPane.add(msg);
		
		tel.addKeyListener(new KeyAdapter() {	
			//keyPressed : 키를 누를때
			//keyReleased : 키를 눌렀다가 up이 되었을때
			//keyTyped : 키를 문자로 입력 받을 때
			@Override
			public void keyTyped(KeyEvent k) {
				
				//입력값에 대한 자릿수 설정
				int i = tel.getText().length();
				if(i>11) {
					k.consume();
				}
//				System.out.println(k.getKeyChar());
//				System.out.println(k.getKeyCode());
				int n = Integer.valueOf(k.getKeyChar());	//아스키코드로 변경
				if(n>=48 && n<=57) {	//sysout에는 정삭적 문자가 보이지만 integer로 변경시 아스키 코드로 변경
					msg.setText("ok");
					System.out.println(n);
				}
				else {
					System.out.println("숫자를 입력");
						k.consume();	
						//keyType를 이용 consume는 해당 입력시 null로 간주함
					
				}
			}
		});
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
	}

}
