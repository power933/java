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
	//imageicon : 이미지 파일을 로드할때 사용
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
				Image reimg = img.getImage();	//이미지 파일 경로를 로드
				//getScaledInstance(가로크기,세로크기,변환방법)
				//SCALE_SMOOTH 자연스럽게
				//SCALE_FAST : 빠르게 적용(픽셀이 깨짐)
				//SCALE_DEFALUT : 이미지가 가지고 있는 해상도에 맞춰 적용
				//SCALE_AREA_AVERAGING : 모니터 해상도 평균값으로 적용
				Image resize = reimg.getScaledInstance(200, 150, Image.SCALE_SMOOTH);
				ImageIcon rimg = new ImageIcon(resize);
				lb.setIcon(rimg);
			
			}
		});
	}
}
