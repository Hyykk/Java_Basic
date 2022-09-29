package Day220926;

public class A09_ForMultiplicationTable___ {
	public static void main(String[] args) {
		for(int i=1;i<=10;i++) 
		{
			for(int j=i;j<=10;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i*2-1;k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
