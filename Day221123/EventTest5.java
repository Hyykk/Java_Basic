package Day221123;

import java.awt.*;
import javax.swing.*;

class EventT5 extends JFrame{
	JButton btn, btn1;
	JTextField txt;
	JPanel panel, panel1;
	public EventT5() {
		this.setSize(400,150);
		this.setLocation(1200,50);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new BorderLayout());
		
		panel = new JPanel();
		btn = new JButton("로그인");
		txt = new JTextField(10);
		
		panel.add(txt);
		panel.add(btn);
		
		panel1 = new JPanel();
		btn1 = new JButton("네트워크 연결 조회");
		panel1.add(btn1);
		
		this.add(panel, BorderLayout.NORTH);
		this.add(panel1, BorderLayout.SOUTH);
		this.setVisible(true);
	}
}

public class EventTest5 {
	public static void main(String[] args) {
		new EventT5();
	}
}
