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
		 	Frame absolute ���·� layer�� �����մϴ�.
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
		
		//�ڵ鸵 Ŭ������ ������Ʈ ���� �����ڵ忡 ������ �ش� ������Ʈ�� �ε����� ���մϴ�.
		JButton btnNewButton = new JButton("\uC544\uC774\uB514 \uCCB4\uD06C");
		btnNewButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(mid.getText().equals("")) {
					msg.setText("���̵� �Է��ϼ���");
				}
				else {
					int lg = mid.getText().length();	//�Է� ���� ����
					if(lg < 5) {
						msg.setText("���̵�� �ټ��� �̻� ��� ����");
					}
					else {
						msg.setText("���̵� ���� ���Դϴ�...");
					}
				}
			}
		});
		btnNewButton.setFont(new Font("����ü", Font.PLAIN, 10));
		btnNewButton.setBackground(Color.LIGHT_GRAY);
		btnNewButton.setBounds(146, 81, 93, 23);
		contentPane.add(btnNewButton);
		
		mid = new JTextField();
		mid.setBounds(126, 48, 122, 23);
		contentPane.add(mid);
		mid.setColumns(10);
		
		
	}
}
