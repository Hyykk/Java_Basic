package Day220914;

import java.util.Scanner;

public class A01_Basic {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); //��ĳ�� ��ü ����
		
		System.out.print("���ڿ� �Է�: ");
		String str1 = scan.nextLine();
		
		System.out.println("�Էµ� ���ڿ��� " + str1);
		
		scan.close();	//��ĳ�� ��ü ������
	}
}