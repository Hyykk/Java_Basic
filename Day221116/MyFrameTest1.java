package Day221116;

import java.awt.*;		// import java.awt.FlowLayout;
import javax.swing.*;	// import javax.swing.JFrame;

class MyFrame1 extends JFrame{
	JButton btn1, btn2, btn3;
	
	public MyFrame1() {
		this.setSize(400, 200);
		this.setTitle("Window Title");
		this.setLocation(1300,50);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	// 실제 윈도우 창을 메모리에서 제거하는 코드
		this.setLayout(new FlowLayout());
		//new FlowLayout() -> 윈도우 창에 맨 상단에 구성요소를 배치(정가운데->오른쪽 순차적으로 배치)

		this.getContentPane().setBackground(Color.yellow);
		
		btn1 = new JButton("Button1");
		btn2 = new JButton("Button2");
		btn3 = new JButton("Button3");
		
		btn1.setBackground(Color.cyan);
		btn2.setBackground(Color.green);
		btn3.setBackground(Color.orange);
		
		this.add(btn1);
		this.add(btn2);
		this.add(btn3);
		this.setVisible(true);
	}
}

public class MyFrameTest1 {
	public static void main(String[] args) {
		new MyFrame1();
	}
}