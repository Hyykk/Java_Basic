package Day220919;

public class A11_Switch {
	public static void main(String[] args) {
		char key = 'A';
		
		switch (key) {
			case 'A':
				System.out.println("A ����");
				break;
			case 'B':
				System.out.println("B ����");
				break;
			case 'C':
				System.out.println("C ����");
				break;
			default:
				System.out.println("D, E, F ����");
				break;						// default������ break�� ��������
		}
	}
}

