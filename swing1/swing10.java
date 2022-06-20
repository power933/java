package swing1;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import java.awt.Color;
import javax.swing.border.LineBorder;
import java.awt.Font;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class swing10 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					swing10 frame = new swing10();
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
	public swing10() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setFont(new Font("돋움체", Font.PLAIN, 12));
		contentPane.setBorder(new LineBorder(Color.LIGHT_GRAY));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		String list[] = {"SKT","KT","LGT","알뜰폰"};
		
		JComboBox cb = new JComboBox(list);
		cb.setFont(new Font("돋움체", Font.PLAIN, 12));
		cb.setBounds(22, 10, 234, 29);
		contentPane.add(cb);
		
		JLabel msg = new JLabel("");
		msg.setBorder(new LineBorder(Color.ORANGE));
		msg.setBackground(Color.LIGHT_GRAY);
		msg.setForeground(Color.LIGHT_GRAY);
		msg.setBounds(10, 69, 246, 36);
		contentPane.add(msg);
		
		cb.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				int v = cb.getSelectedIndex();	
				//배열을 index형태로 로드 단 필드에 배열이 선언되어있어야함
				//msg.setText(data) -> data자리에 list[v]
				System.out.println(e.getItem());
//				String data = String.valueOf(cb.getSelectedItem());
//				String data = cb.getSelectedItem().toString();
//				String data = String.valueOf(e.getItem());
				String data = e.getItem().toString();
				msg.setText(data);
				
			}
		});
		
	}
}









