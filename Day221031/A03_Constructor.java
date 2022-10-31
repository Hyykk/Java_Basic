package Day221031;

import java.util.Scanner;
import javax.swing.JFrame;

class WinDuck extends JFrame{
	public WinDuck() {
		this.setSize(500, 400);
		this.setTitle("WinDuck");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		
		this.setVisible(true);
	}
	public WinDuck(int height, int width, String title) {
		this.setSize(height, width);
		this.setTitle(title);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		
		this.setVisible(true);
	}
}

public class A03_Constructor {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int choice = scan.nextInt();
		
		if(choice == 1) {
			new WinDuck();
		}
		else if(choice == 2) {
			new WinDuck(800, 600, "WinDuck");
		}
	}
}
