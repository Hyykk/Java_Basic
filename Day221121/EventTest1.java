package Day221121;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class EventT1 extends JFrame{
	JButton btn1;
	
	public EventT1() {	// ������ â�� �̺�Ʈ ���α׷���(Listener)
		this.setSize(400, 150);
		this.setLocation(1000, 50);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		
		btn1 = new JButton("Click Button");
		btn1.addActionListener(new MyEvent1());	//btn1 Listener ��ü�� ���
												//��ϵ� ����, btn1���� Ŭ���� ���� �̺�Ʈ �����
												//MyEvent1�� �����Ͽ� ����
		
		this.add(btn1);
		this.setVisible(true);
	}
	class MyEvent1 implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			JOptionPane.showMessageDialog(null, "Message1");
		}
	}
}

public class EventTest1 {
	public static void main(String[] args) {
		new EventT1();
	}
}
