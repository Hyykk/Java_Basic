package Day220919;

public class A01_Oper {
	public static void main(String[] args) {
		//���� ����: 1�� ����/ 2�� ���� (��������) 9 - 4 = 5 + 9 + (-4) = +5
		//- 1�� ����: 10���� 2������ȯ -> 0->1, 1->0
		//- 2�� ����: 1�Ǻ������� +1�� ���ָ� 2�� ������ ��.
		// : Ư�����ڸ� 1�� ���� -> 2�� ���� : ���ڿ� ��ȣ�� �ٲ�
		
		int number = -200;
		System.out.println("number : " + number);
		
		int n1 = ~number;	// -200�� 1�� ����
		System.out.println("number 1�� ����: " + n1);
		
		int n2 = n1 + 1;	// 1�� ������� + 1
		System.out.println("number 2�� ����: " + n2);
		
		int score = 55;
		int res = (~score) + 1;
		System.out.println(score + " : " + res);
		
		//����Ʈ �����ڴ� ��Ʈ�� ��ġ�� �̵����Ѽ� ���ڸ� �����ϴ� ���.
		int inval = 100;
		System.out.println("100����Ʈ�̵� : " + inval);
		
		int shiftR = inval >> 1;
		System.out.println("100 ������ ����Ʈ 1�̵�: " + shiftR);
		
		int shiftR1 = shiftR >> 1;
		System.out.println("100 ������ ����Ʈ 1�̵�: " + shiftR1);
		
		int shiftR2 = shiftR1 >> 1;
		System.out.println("100 ������ ����Ʈ 1�̵�: " + shiftR2);
		
		int temp = 100;
		int shifttemp = temp << 1;
		System.out.println("100 ���� ����Ʈ 1�̵�: " + shifttemp);
		
		int a1 = 4, a2 = 2;
		int s = a1 & a2;	//���ڸ� 2���� ��ȯ �Ŀ� �� ��Ʈ ������� &������ �Ѵ�.
							//&������ 2���� 2�������� ���� �� 1:1�϶��� 1�� ��Ʈ ��.
		
		System.out.println(s);
	}
}