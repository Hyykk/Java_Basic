package Day221017;

import java.util.Scanner;

class InputSample{
	public void inputValue(Scanner scan) {
		System.out.println("input number : ");
		int num = scan.nextInt();
		System.out.println(num * num);
	}
}

public class A03_ScannerRefer {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		InputSample isa = new InputSample();
		isa.inputValue(sc);	//객체 참조변수를 전달
	}
}
//refernece of scanners that is in main and class are same