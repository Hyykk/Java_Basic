package Day220919;

import java.util.Scanner;

public class A06_leapyear {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("알고 싶은 윤년의 년도 입력(2022): ");
		int y = scan.nextInt();
		
		System.out.println("입력하신 년도 : " + y);
		
		if(((y % 4 == 0) && (y % 100 != 0)) || (y % 400 == 0)) {
			System.out.println("2월에 29일 있음. 윤년");
		}else {
			System.out.println("2월에 28일만 있음. 평년");
		}
	}
}
