package Day220914;

public class A07_InDe {
	public static void main(String[] args) {
		int x = 1;
		int q = 0;
		
		q = x++ + 2;	//x+2�� q�� �����Ŀ� x�� 1����(����������)
		System.out.println(q);
		
		q = ++x + 2;	//x�� 1�����Ŀ� x+2�� q�� ����(����������)
		System.out.println(q);
		
		x++;			// x = x + 1;
		++x;			// x = x + 1;
		System.out.println(x);
	}
}
