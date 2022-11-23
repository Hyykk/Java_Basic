package Day221123;

import java.util.Scanner;

class Anything{
	Scanner scan = new Scanner(System.in);
	public Anything() {
		System.out.print("number1: ");
		int num1 = scan.nextInt();
		System.out.print("number2: ");
		int num2 = scan.nextInt();
		int result = 0;
		
		try {
			result = num1 / num2;
		}catch(ArithmeticException e) {
			System.out.println("divided by zero");
		}finally {
			scan.close();
		}
		
		System.out.println(result);
	}
}

public class ExceptionTest1 {
	public static void main(String[] args) {
		new Anything();
	}
}
