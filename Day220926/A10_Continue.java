package Day220926;

public class A10_Continue {
	public static void main(String[] args) {
		for(int i=1; i<=10; i++) {
			
			if(i%2 != 0) {
				continue;	//	�Ʒ��� ������ �������� �ʰ� �ݺ����� ó������ ���ư�.
			}
			
			System.out.println(i);
		}
	}
}
