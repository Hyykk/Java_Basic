package Day220919;

import java.util.Scanner;

public class A06_leapyear {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("�˰� ���� ������ �⵵ �Է�(2022): ");
		int y = scan.nextInt();
		
		System.out.println("�Է��Ͻ� �⵵ : " + y);
		
		if(((y % 4 == 0) && (y % 100 != 0)) || (y % 400 == 0)) {
			System.out.println("2���� 29�� ����. ����");
		}else {
			System.out.println("2���� 28�ϸ� ����. ���");
		}
	}
}
