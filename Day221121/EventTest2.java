package Day221121;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class EventT2 extends JFrame implements ActionListener {
	JButton btn1, btn2, btnInit;
	JLabel lbl;
	int counter = 0;
	
	public EventT2() {
		this.setSize(400, 150);
		this.setLocation(1000, 50);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());

		lbl = new JLabel("Count : " + counter);
		btn1 = new JButton("Increase count");
		btn2 = new JButton("Decrease count");
		btnInit = new JButton("Count reset");
		btn1.addActionListener(this);
		btn2.addActionListener(this);
		btnInit.addActionListener(this);
		
		this.add(lbl);
		this.add(btn1);
		this.add(btn2);
		this.add(btnInit);
		this.setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == btn1) {
			counter++;
			lbl.setText("Count : " +  counter);
		}
		else if(e.getSource() == btn2) {
			if(counter <= 0) {
				return;
			}
			counter--;
			lbl.setText("Count : " +  counter);
		}
		else if(e.getSource() == btnInit) {
			counter = 0;
			lbl.setText("Count : " + counter);
		}
	}
}

public class EventTest2 {
	public static void main(String[] args) {
		new EventT2();
	}
}
