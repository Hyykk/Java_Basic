package Day220919;

public class A08_if06 {
	public static void main(String[] args) {
		int A = 10, B = 10, C = 10;
		
		if ( A == B) {
			if ( B == C) {
				System.out.println("A와 C는 같다.");
			}else {
				System.out.println("A와 C는 같지 않다.");
			}
		}else {
			System.out.println("A와 B는 같지 않다.");
		}
		
		//이렇게 줄일 수 있음
		if( A == B && B == C) {
			System.out.println("A와 C는 같다.");
		}else {
			System.out.println("같지 않다.");
		}
	}
}
