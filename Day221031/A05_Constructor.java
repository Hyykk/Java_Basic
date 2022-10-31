package Day221031;

import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

class WinDuck2 extends JFrame{
	public WinDuck2() {
		this.setSize(600, 500);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		
		JButton button = new JButton();
		button.setText("button1");
		
		JButton btn = new JButton("button2");
		
		this.add(button);
		this.add(btn);
		
		this.setVisible(true);
	}
}

public class A05_Constructor {
	public static void main(String[] args) {
		new WinDuck();
	}
}
