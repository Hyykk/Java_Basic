package Day220921;

import java.util.Scanner;

public class A04_Loop {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//Ű����� ������ �Է¹ް� ��� ���ϴ� ����(0�� �Է��ϸ� ������)
		
		int result = 0, keyValue;
		while(true) {
			System.out.println("���� ���� �Ѱ��� �Է�(0�Է��̸� ��)>> ");
			keyValue = scan.nextInt();
			if(keyValue == 0)	break;
			result = result + keyValue;
		}
		System.out.println("���:" + result);	
	}
}
