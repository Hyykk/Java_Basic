package Day220919;

import java.util.Scanner;

public class A07_if05 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Y or y : ");
		char f = scan.next().charAt(0);
		
		if( f == 'Y') {
			System.out.println("Y�� ����");
		}else if( f == 'y') {
			System.out.println("y�� ����");
		}else if( f == 'N') {
			System.out.println("N�� ����");
		}else if( f == 'n') {
			System.out.println("n�� ����");
		}else {
			System.out.println("Y�� �ƴ�");
		}
	}
}
