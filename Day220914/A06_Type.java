package Day220914;

public class A06_Type {
	public static void main(String[] args) {
		int x = 50000;
		long y;
				// long > int(�޸� ũ��)
		y = x;	// intŸ���� ���� x���� longŸ���� y������ ����.
		System.out.println(y);
		
		long w = 1243L;
		int q;
		
		//q = w;	���� �߻� : long < int == false
		q = (int)w;	//int���� w�������� ������ int������ ��ȯ�ؼ� ����.
		System.out.println(q);
	}
}
