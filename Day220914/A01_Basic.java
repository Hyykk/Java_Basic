package Day220914;

import java.util.Scanner;

public class A01_Basic {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); //스캐너 객체 생성
		
		System.out.print("문자열 입력: ");
		String str1 = scan.nextLine();
		
		System.out.println("입력된 문자열은 " + str1);
		
		scan.close();	//스캐너 객체 끝내기
	}
}