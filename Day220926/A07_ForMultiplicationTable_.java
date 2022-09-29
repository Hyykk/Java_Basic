package Day220926;

public class A07_ForMultiplicationTable_ {
	public static void main(String[] args) {
		
		for(int i = 1; i <= 9; i++) {
			for(int j = 2; j <= 9; j++) {
				System.out.print(j + "*" + i + " = " + i*j + " / ");
			}
			System.out.println();
		}
	}
}
