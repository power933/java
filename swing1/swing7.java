package swing1;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class swing7 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					swing7 frame = new swing7();
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
	public swing7() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 35, 399, 38);
		contentPane.add(panel);
		
		JRadioButton rd1 = new JRadioButton("�ſ�ī��");
		
		rd1.setName("CARD");

		rd1.setSelected(true);
		panel.add(rd1);
		
		JRadioButton rd2 = new JRadioButton("������ü");
		rd2.setName("BANK");
		panel.add(rd2);
		
		JRadioButton rd3 = new JRadioButton("������ �Ա�");
		rd3.setName("");
		rd3.setName("NOBANK");
		//setName�� ������ ���� ������ ��׶��忡�� �ش� �Ӽ��� ���� �����ϴ°�.
		panel.add(rd3);
		
		ButtonGroup gp = new ButtonGroup();	//radio���� ���v�� ��ư �׷��� ���
		gp.add(rd1);
		gp.add(rd2);
		gp.add(rd3);
		
		JButton bdn = new JButton("��������");
		
		bdn.setBounds(160, 109, 93, 23);
		contentPane.add(bdn);
		
		JPanel mu = new JPanel();
		mu.setVisible(false);
		mu.setBounds(0, 165, 438, 100);
		contentPane.add(mu);
		
		mu.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(10, 10, 96, 21);
		mu.add(textField);
		textField.setColumns(10);
		
		
		
		bdn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				String pay = "";
				if(rd1.isSelected() == true) {
					pay = rd1.getName();
					System.out.println("�ſ�ī�� ����");
				}else if(rd2.isSelected()==true) {
					System.out.println("������ü ����");
				}else {
					System.out.println(true);
				}
				
			}
		});
		
		
		
		
		
	}
}
