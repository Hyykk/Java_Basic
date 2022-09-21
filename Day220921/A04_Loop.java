package Day220921;

import java.util.Scanner;

public class A04_Loop {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//키보드로 정수를 입력받고 계속 더하는 예제(0을 입력하면 끝내기)
		
		int result = 0, keyValue;
		while(true) {
			System.out.println("정수 범위 한개만 입력(0입력이면 끝)>> ");
			keyValue = scan.nextInt();
			if(keyValue == 0)	break;
			result = result + keyValue;
		}
		System.out.println("결과:" + result);	
	}
}
