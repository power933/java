import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//인증번호 발송 시스템 awt6_abstract
public abstract class awt6_abstract {
	Frame f = new Frame();
	Button send = null;
	Button ok = null;
	Button close = null;
	TextField tx = null;
	Label lb = new Label();
	public abstract String mr();
	public abstract String compare(String a);
	String msg;
	
	public void design(){
		f.setVisible(true);
		f.setLayout(null);
		this.send = new Button("인증번호 발송");
		this.ok = new Button("인증확인");
		this.close = new Button("X");
		tx = new TextField();
		lb.setBackground(Color.LIGHT_GRAY);
		f.setBounds(0,0,350,200);
		send.setBounds(50,50,100,25);
		ok.setBounds(300,100,30,25);
		tx.setBounds(50,100,140,25);
		ok.setBounds(250,100,100,25);
		lb.setBounds(50,150,250,25);
		close.setBounds(300,50,30,25);
		
		f.add(close);
		f.add(lb);
		f.add(ok);
		f.add(tx);
		f.add(send);
		
		click();
	}
	
	public void click() {
		close.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		
		send.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
				mr();
			}
		});
		ok.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String a = tx.getText();
				if(a.equals("")) {
					lb.setText("인증키를 입력하세요");
				}
				else {
					
					lb.setText(compare(a));
				}
			}
		});
		
	}

}
