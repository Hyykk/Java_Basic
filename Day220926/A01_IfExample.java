package Day220926;

public class A01_IfExample {
	public static void main(String[] args) {
		int score = 93;
		
		if(score>=90) {	// score���� ����� ����, 8�� 9�� ���� ����
			System.out.println("������ 90���� Ů�ϴ�.");
			System.out.println("����� A �Դϴ�.");
		}
		
		if(score < 90)	//score���� ����� ����, 11�� 12�� ���� ����
			System.out.println("������ 90���� �۽��ϴ�.");
			System.out.println("����� B �Դϴ�.");
	}
}
