package Day220926;

public class A08_ForMultiplicationTable__ {
	public static void main(String[] args) {
		for(int i = 1; i<= 10; i++) {
			System.out.println("i = " + i);
			
			for(int j = 1; j <= 10; j++) {
				System.out.println("j =" + j);
				
				for(int k = 1; k <= 10; k++) {
					System.out.print(k + " ");
				}
				System.out.println();
			}
		}
	}
}
