package Day221121;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class EventT1 extends JFrame{
	JButton btn1;
	
	public EventT1() {	// 윈도우 창에 이벤트 프로그래밍(Listener)
		this.setSize(400, 150);
		this.setLocation(1000, 50);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		
		btn1 = new JButton("Click Button");
		btn1.addActionListener(new MyEvent1());	//btn1 Listener 객체에 등록
												//등록된 이후, btn1에서 클릭과 같은 이벤트 방생시
												//MyEvent1을 생성하여 실행
		
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
