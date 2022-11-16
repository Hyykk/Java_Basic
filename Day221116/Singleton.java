package Day221116;

// ��ü������ �ϰ� ���α׷� �����߿� Ư�� ��ü�� �޸𸮻� �ܵ����� �־�� �Ǵ� ��� ����ϴ� ����
// �̱��� ���� : �޸𸮻��� ���Ϲ����� ��ü
//				��Ʈ��ũ����, �����ͺ��̽� ���� -> �� ���ᰴü�� 1���� �����ϴ� ���
//				�����ڰ� ��ü�� �ѹ��� �����ϰ� �ϰ� �ι�° �������ʹ� ����



public class Singleton {
	private static Singleton instance = new Singleton();
	// static������ �޸� �󿡼� 1���� ����
	
	private Singleton() {
		System.out.println("Singleton constructed");
	}
	public static Singleton getInstance() {
		return instance;
	}
	
	public static void main(String[] args) {
		// Singleton s1 = new Singleton();
		Singleton s1 = Singleton.getInstance();
	}
}
