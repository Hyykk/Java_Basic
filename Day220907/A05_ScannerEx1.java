package Day220907;

import java.util.Scanner;	//Java�ȿ��ִ� Util�ȿ��ִ� Scanner��� ���� ����
//import java.util.*;		*�� ��� �� ��� �ǹ�

//input - processing - output(save)
//Scaner(Object ��ü)
//new -> ��ü ����(���޸� �Ҵ�)

public class A05_ScannerEx1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("�й�: ");
		int num = scan.nextInt();
		
		System.out.print("����: ");
		int age = scan.nextInt();
	}
}
