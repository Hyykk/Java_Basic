package Day220921;

public class A01_Loop {
	public static void main(String[] args) {
		//while
		int i = 1;		//�ݺ� ������ �ʱ⺯��
		
		int sum = 0;	//����
		
		while(i <= 10) {	//�ݺ� Ƚ�� ���� : �ݺ� ���ǽ�
			System.out.println(i);	//�ݺ��� �ڵ�
			sum = sum + i;
			
			i++;		//�ݺ� Ƚ�� ī��Ʈ (���� �������� ��)
		}
		System.out.println("1+2+3+...+10=" + sum);
	}
}
