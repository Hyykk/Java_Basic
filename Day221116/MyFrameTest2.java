package Day221116;

import java.awt.*;
import javax.swing.*;

class MyFrame2 extends JFrame{
	JButton btn1, btn2, btn3, btn4, btn5;
	
	public MyFrame2() {
		this.setSize(300, 200);
		this.setTitle("Border Layout");
		this.setLocation(1300,50);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new BorderLayout());
		
		btn1 = new JButton("North");
		btn2 = new JButton("South");
		btn3 = new JButton("East");
		btn4 = new JButton("West");
		btn5 = new JButton("Center");
		
		this.add(btn1, "North");
		this.add(btn2, "South");
		this.add(btn3, "East");
		this.add(btn4, "West");
		this.add(btn5, "Center");
		
		this.setVisible(true);
	}
}

public class MyFrameTest2 {
	public static void main(String[] args) {
		new MyFrame2();
	}
}
