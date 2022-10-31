package Day221031;

import java.util.Scanner;

class Duck1{
	private double duckSize;
	private String duckName;
	
	public Duck1(double duckSize, String duckName) {
		this.duckSize = duckSize;
		this.duckName = duckName;
		System.out.println(this.duckName + " : " + this.duckSize);
	}
}

public class A02_Constructor {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("DuckSize>> ");
		double duckSize = scan.nextDouble();
		System.out.println("DuckName>> ");
		String duckName = scan.next();
		
		new Duck1(duckSize, duckName);
	}
}
