package Day220919;

import java.util.Scanner;

public interface A03_if02 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("0이상의 숫자를 입력해라(0이하면 0으로 간주): ");
		int num = scan.nextInt();
		
		if(num < 0) num = 0;	//한줄일때 { } 생략가능
		
		System.out.println("입력된 num = " + num);
	}
}