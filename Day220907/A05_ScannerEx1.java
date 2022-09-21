package Day220907;

import java.util.Scanner;	//Java안에있는 Util안에있는 Scanner라는 것을 내포
//import java.util.*;		*는 모두 다 라는 의미

//input - processing - output(save)
//Scaner(Object 객체)
//new -> 객체 생성(힙메모리 할당)

public class A05_ScannerEx1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("학번: ");
		int num = scan.nextInt();
		
		System.out.print("나이: ");
		int age = scan.nextInt();
	}
}
