package Day220921;

public class A06_for {
	public static void main(String[] args) {
		//�ݺ��� �ʱ� ����, ���ǽ�, �ݺ� Ƚ�� ī��Ʈ�� �ѹ��忡 ����.
		int sum = 0;
		for(int i = 1; i <= 100; i++) {
			sum = sum + i;
		}
		System.out.println(sum);
		
		int hol;
		for(int k = 1; k <= 100; k+=2) {
			hol = hol + k;
		}
		System.out.println("hol");
	}
}