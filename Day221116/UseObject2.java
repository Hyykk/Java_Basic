package Day221116;

class SingletonTwo{
	private static SingletonTwo instance;
	private SingletonTwo() {
		System.out.println("SingletonTwo constructed");
	}
	static {
		try {
			instance = new SingletonTwo();
		}catch(Exception e) {
			throw new RuntimeException("�̱��� �����߿� �߻��ϴ� ���ܻ�Ȳ");
		}
	}
	public static SingletonTwo getInstance() {
		/*
		if(instance == null) {
			instance = new SingletonTwo();
		}
		return instance;
		*/
		return instance;
	}
}

public class UseObject2 {
	public static void main(String[] args) {
		SingletonTwo s1 = SingletonTwo.getInstance();
		SingletonTwo s2 = SingletonTwo.getInstance();
		SingletonTwo s3 = SingletonTwo.getInstance();
	}
}