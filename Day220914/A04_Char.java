package Day220914;

import java.util.Scanner;

public class A04_Char {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		//1)
		//System.out.println("Ű����κ��� ���� �Ѱ� �Է� : ");
		//char key = scan.next().charAt(0);
		
		//2)
		String tmp = scan.next();
		char key = tmp.charAt(0);
		
		
		System.out.println(key);
	}
}