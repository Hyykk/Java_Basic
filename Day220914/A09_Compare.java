package Day220914;

import java.util.Scanner;

public class A09_Compare {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// password��
		String password = "moon1234!";
		
		System.out.println("password : ");
		String upass = scan.next();	//next()�� ���⸦ ������� ����
		
		boolean login = password.equals(upass);
		System.out.println(login);
		
		//yes or no
		System.out.print("1. ��� �ҷ���?(y/n)>> ");
		char yesornoChar = scan.next().charAt(0);
		
		if(yesornoChar == 'Y' | yesornoChar == 'y') {
			System.out.println("Yes");
		}
		
		System.out.print("2. ��� �ҷ���?(y/n)>> ");
		String yesornoLine = scan.next();
		if(yesornoLine.equalsIgnoreCase("y")) {
			System.out.println("Yes");
		}
		

	}
}
