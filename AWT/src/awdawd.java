import java.awt.*;

public class awdawd {

	public static void main(String[] args) {
		
		page p = new page();
	}

}

class page{
	Frame fr = new Frame();
	Button bt = new Button("·Î±×ÀÎ");
	TextField tx = new TextField();
	page(){
		fr.setVisible(true);
		fr.setTitle("123");
		fr.setLayout(null);
		fr.setBounds(0,0,300,300);
		bt.setBounds(0,100,100,20);
		tx.setBounds(0,30,100,20);
		fr.add(bt);
		fr.add(tx);
		
	}
}

