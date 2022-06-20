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
			//keyPressed : Ű�� ������
			//keyReleased : Ű�� �����ٰ� up�� �Ǿ�����
			//keyTyped : Ű�� ���ڷ� �Է� ���� ��
			@Override
			public void keyTyped(KeyEvent k) {
				
				//�Է°��� ���� �ڸ��� ����
				int i = tel.getText().length();
				if(i>11) {
					k.consume();
				}
//				System.out.println(k.getKeyChar());
//				System.out.println(k.getKeyCode());
				int n = Integer.valueOf(k.getKeyChar());	//�ƽ�Ű�ڵ�� ����
				if(n>=48 && n<=57) {	//sysout���� ������ ���ڰ� �������� integer�� ����� �ƽ�Ű �ڵ�� ����
					msg.setText("ok");
					System.out.println(n);
				}
				else {
					System.out.println("���ڸ� �Է�");
						k.consume();	
						//keyType�� �̿� consume�� �ش� �Է½� null�� ������
					
				}
			}
		});
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
	}

}
