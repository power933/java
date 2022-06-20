package swing1;

import java.awt.EventQueue;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;

//Progress바 사용법 

public class swing8 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					swing8 frame = new swing8();
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
	JProgressBar progress;
	JLabel label;

	public swing8() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		this.progress = new JProgressBar();
		this.progress.setStringPainted(true);
		this.progress.setBounds(46, 20, 339, 20);
		contentPane.add(progress);

		label = new JLabel("");
		label.setBounds(46, 70, 339, 15);
		contentPane.add(label);

		// swing 프로그램이 작동 후 해당 메소드로 1초 후 실행되도록 적용함
		Timer t = new Timer();
		TimerTask task = new TimerTask() {

			@Override
			public void run() {
				pstart();

			}
		};

		t.schedule(task, 1000);

	}

	public void pstart() {
		int w = 0;
		try {
			while (w <= 100) {
				this.progress.setValue(w); // setValue 해당 기본 값을 말함
				Thread.sleep(50);
				w++;

			}
		} catch (Exception k) {
			System.out.println("오류발생");
		}
		if (this.progress.getValue() == 100) {
			label.setText("다운완료");
		}
	}
}
