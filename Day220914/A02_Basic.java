package Day220914;

import java.util.Scanner;

public class A02_Basic {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("파이값 입력: ");
		double PI = scan.nextDouble();
		
		System.out.println(5 * 5 * PI);
		
		scan.close();
	}
}
