package Day220928;

public class A05_Array {
	//	String[] args: ���ڿ� �迭: cmdâ �Է����� ������ �μ�(�迭�� �����Է�, ���ڿ�, �ε�����ȣ0���� ����.)
	
	//	c:\>javac A05_Array.java	->	������ ��, ������ �����紺 A05_Array.class�� ������.
	//	c:\>java A05_Array			-> 	����
	//	c:\>java A05_Array 100 200 300	->	main(): String[] args�� �迭���·� �Էµ�.
	public static void main(String[] args) {
		System.out.println("args[0]: " + args[0]);
		System.out.println("args[1]: " + args[1]);
		System.out.println("args[2]: " + args[2]);
		
		int a = Integer.parseInt(args[0]);	//args[0] ���ڿ��� ���ڸ� ����Ÿ������ ��ȯ
		int b = Integer.parseInt(args[1]);
		int c = Integer.parseInt(args[2]);
		System.out.println(a+b+c);
	}
}
