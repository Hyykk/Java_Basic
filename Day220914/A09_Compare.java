package Day220914;

import java.util.Scanner;

public class A09_Compare {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// password비교
		String password = "moon1234!";
		
		System.out.println("password : ");
		String upass = scan.next();	//next()는 띄어쓰기를 허용하지 않음
		
		boolean login = password.equals(upass);
		System.out.println(login);
		
		//yes or no
		System.out.print("1. 계속 할래요?(y/n)>> ");
		char yesornoChar = scan.next().charAt(0);
		
		if(yesornoChar == 'Y' | yesornoChar == 'y') {
			System.out.println("Yes");
		}
		
		System.out.print("2. 계속 할래요?(y/n)>> ");
		String yesornoLine = scan.next();
		if(yesornoLine.equalsIgnoreCase("y")) {
			System.out.println("Yes");
		}
		

	}
}
