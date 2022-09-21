package Day220921;

public class A02_Loop {
	public static void main(String[] args) {
		int i = 10;
		int sum = 0;
		while(i >= 1) {
			System.out.println(i);
			sum = sum + i;
			
			i--;
		}
		System.out.println("10+9+8+...+=" + sum);
	}
}
