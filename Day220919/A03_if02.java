package Day220919;

import java.util.Scanner;

public interface A03_if02 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("0�̻��� ���ڸ� �Է��ض�(0���ϸ� 0���� ����): ");
		int num = scan.nextInt();
		
		if(num < 0) num = 0;	//�����϶� { } ��������
		
		System.out.println("�Էµ� num = " + num);
	}
}