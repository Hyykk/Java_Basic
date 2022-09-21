package Day220907;

public class A02_VarError {
	public static void main(String[] args) {
		int number = -2147483648;
		long score = -9223372036854775808L;
		
		System.out.println("number: " + number);
		System.out.println("score: " + score);
	}
}
