import java.awt.*;
import java.awt.event.*;

public class awt4_class {
	public void view() {
		decorate de = new decorate();
		Frame f = new Frame();
//		Label lb = new Label();
		TextArea lb = new TextArea();
		f.setBounds(200,200,300,300);
		f.setVisible(true);
		f.setLayout(null);
		Button btn = new Button("���");
		Button closebtn = new Button("����");
		TextField input = new TextField();
		lb.setBackground(Color.gray);
		input.setBounds(50,50,100,25);
		btn.setBounds(180,50,80,25);
		closebtn.setBounds(50,200,80,25);
		lb.setBounds(50,100,100,100);
		f.add(input);
		f.add(closebtn);
		f.add(btn);
		f.add(lb);
		
		
		closebtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		
		btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
				int c= Integer.parseInt(input.getText());
				de.btn_push(c);
				lb.setText(de.calls());
				}
				catch(Exception ee) {
					lb.setText("���ڸ� �Է��ϼ���");
				}
			}
		});
	}
}



