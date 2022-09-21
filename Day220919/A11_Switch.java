package Day220919;

public class A11_Switch {
	public static void main(String[] args) {
		char key = 'A';
		
		switch (key) {
			case 'A':
				System.out.println("A 학점");
				break;
			case 'B':
				System.out.println("B 학점");
				break;
			case 'C':
				System.out.println("C 학점");
				break;
			default:
				System.out.println("D, E, F 학점");
				break;						// default에서는 break문 생략가능
		}
	}
}

