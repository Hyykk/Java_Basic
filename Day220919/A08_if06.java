package Day220919;

public class A08_if06 {
	public static void main(String[] args) {
		int A = 10, B = 10, C = 10;
		
		if ( A == B) {
			if ( B == C) {
				System.out.println("A�� C�� ����.");
			}else {
				System.out.println("A�� C�� ���� �ʴ�.");
			}
		}else {
			System.out.println("A�� B�� ���� �ʴ�.");
		}
		
		//�̷��� ���� �� ����
		if( A == B && B == C) {
			System.out.println("A�� C�� ����.");
		}else {
			System.out.println("���� �ʴ�.");
		}
	}
}
