package Day220919;

public class A10_Switch {
	public static void main(String[] args) {
		int key = 1;
		
		switch (key) {
		case 1:
			System.out.println("key = 1");
			break;
		case 2:
			System.out.println("key = 2");
			break;
		case 3:
			System.out.println("key = 3");
			break;
		default:
			System.out.println("key = etc...");
			break;						// default에서는 break문 생략가능
		}
	}
}
