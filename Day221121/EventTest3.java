package Day221121;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class EventT3 extends JFrame implements ActionListener {
	JButton btn1, btn2, btnInit;
	JLabel lbl;
	int counter = 0;
	
	public EventT3() {
		this.setSize(400, 150);
		this.setLocation(1000, 50);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());

		lbl = new JLabel("Count : " + counter);
		btn1 = new JButton("Increase count");
		btn2 = new JButton("Decrease count");
		btnInit = new JButton("Count reset");
		btn1.addActionListener(e ->{
				counter++;
				lbl.setText("Count : " +  counter);
			}
		);
		btn2.addActionListener(e -> {
				if(counter <= 0) {
					return;
				}
				counter--;
				lbl.setText("Count : " +  counter);
			}
		);
		btnInit.addActionListener(e -> {
			counter = 0;
			lbl.setText("Count : " +  counter);
		});
		
		this.add(lbl);
		this.add(btn1);
		this.add(btn2);
		this.add(btnInit);
		this.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
	}
}

public class EventTest3 {
	public static void main(String[] args) {
		new EventT3();
	}
}
