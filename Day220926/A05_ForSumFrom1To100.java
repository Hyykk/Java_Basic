package Day220926;

public class A05_ForSumFrom1To100 {
	public static void main(String[] args) {
		int sum = 0;
		
		int i = 0;
		for(i = 1; i <= 100; i++) {
			sum += i;
		}
		System.out.println("i = " + i);
		
		for(int k = 1; k<= i; k++) {
			System.out.print(k + " ");
		}
	}
}
