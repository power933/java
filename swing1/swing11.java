package swing1;

import java.awt.EventQueue;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class swing11 extends JFrame {
	//imageicon : �̹��� ������ �ε��Ҷ� ���
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					swing11 frame = new swing11();
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
	JLabel lb;
	public swing11() {
		getContentPane().setLayout(null);
		
		lb = new JLabel("");
		lb.setBounds(22, 51, 393, 190);
		getContentPane().add(lb);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btn = new JButton("\uC774\uBBF8\uC9C0\uB85C\uB4DC");
		btn.setBounds(36, 27, 93, 23);
		contentPane.add(btn);
		contentPane.add(lb);
		
		
		
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ImageIcon img = new ImageIcon("C:\\java4\\Swing\\Swing\\src\\swing1\\apink.jpg");
				Image reimg = img.getImage();	//�̹��� ���� ��θ� �ε�
				//getScaledInstance(����ũ��,����ũ��,��ȯ���)
				//SCALE_SMOOTH �ڿ�������
				//SCALE_FAST : ������ ����(�ȼ��� ����)
				//SCALE_DEFALUT : �̹����� ������ �ִ� �ػ󵵿� ���� ����
				//SCALE_AREA_AVERAGING : ����� �ػ� ��հ����� ����
				Image resize = reimg.getScaledInstance(200, 150, Image.SCALE_SMOOTH);
				ImageIcon rimg = new ImageIcon(resize);
				lb.setIcon(rimg);
			
			}
		});
	}
}
