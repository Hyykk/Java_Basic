package Day220926;

public class A02_IfElseExample {
	public static void main(String[] args) {
		int score = 85;
		
		if(score >= 90) {	//score���� ����� ���� 8, 9���� �����ϰų� 11, 12���� ������
			System.out.println("������ 90���� Ů�ϴ�.");
			System.out.println("����� A �Դϴ�.");
		} else {			//else�� �ִ� ���� ���ǽ��� ���� ���� �ʴ´�.
			System.out.println("������ 90���� �۽��ϴ�.");
			System.out.println("����� B �Դϴ�.");
		}
	}
}
