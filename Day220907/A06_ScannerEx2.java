package Day220907;
import java.util.Scanner;							//Library import

public class A06_ScannerEx2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);		//Scanner
		
		final double PI = 3.14159265;				//FinalVar

		System.out.print("radius input: ");			//Input
		int radius = scan.nextInt();
		
		double circleArea = (radius * radius) *PI;	//Process
		
		System.out.println("radius: " + radius);	//Output
		System.out.println("area: " + circleArea);
	}
}
