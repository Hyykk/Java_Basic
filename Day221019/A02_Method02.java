package Day221019;

import java.util.Scanner;

class Temp{	
	public double circleArea(int r) {
		return r * r* 3.14;
	}
	
	public void starDisplay(int cnt) {
		for(int i = 1; i <= cnt; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public void display() {	//return X, parameter X
		System.out.print("Get integer: ");
	}
	
	public int inputNumber(Scanner scan) {	// return O, parameter X
		display();
		return scan.nextInt();
	}
	public int processNumber(int num) {	// return O, parameter O
		return num * num;
	}
	public void outputNumber(int num, int result){	// return X, parameter O
		System.out.println(num + " * " + num + " = " + result);
	}
}

public class A02_Method02 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Temp temp = new Temp();
		
		System.out.print("Select number(1, 2, 3): ");
		int key = scan.nextInt();
		
		switch (key) {
		case 1:
			System.out.println(temp.circleArea(temp.inputNumber(scan)));
			break;
		case 2:
			temp.starDisplay(temp.inputNumber(scan));
			break;
		case 3:
			int num = temp.inputNumber(scan);
			temp.outputNumber(num, temp.processNumber(num));
			break;
		default :
			System.out.println("Wrong number selected.");
		}
	}
}