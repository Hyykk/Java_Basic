package Day221031;

class Duck{
	private int duckSize;
	private String duckName;
	public Duck() {
		duckSize = 500;
		duckName = "Duck";
		System.out.println(duckName + " : " + duckSize);
	}
}

public class A01_Constructor {
	public static void main(String[] args) {
		new Duck();	// ������ �޼ҵ� ȣ��
					// �����ڴ� ��ü�� newŰ����� ������ �� ���� ���� ����Ǵ� �޼ҵ�
					// �Ű������� 0�� �̻�, ����Ÿ���� �������� ����
	}
}
