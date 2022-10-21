package Day221019;
import java.util.Scanner;

//	Method == function <= module <= package <= library <= API, Beans(JAR file), Component(dll)

public class A01_Method01 {
	static Scanner scan = new Scanner(System.in);	// Global
	
	public static double circleArea(int r) {
		return r * r* 3.14;
	}
	
	public static void starDisplay(int cnt) {
		for(int i = 1; i <= cnt; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static void display() {	//return X, parameter X
		System.out.print("Get integer: ");
	}
	
	public static int inputNumber() {	// return O, parameter X
		display();
		return scan.nextInt();
	}
	public static int processNumber(int num) {	// return O, parameter O
		return num * num;
	}
	public static void outputNumber(int num, int result){	// return X, parameter O
		System.out.println(num + " * " + num + " = " + result);
	}
	
	public static void main(String[] args) {
		int num = inputNumber();
		outputNumber(num, processNumber(num));
		starDisplay(num);
		System.out.println(circleArea(num));
	}
}