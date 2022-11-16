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
			throw new RuntimeException("싱글턴 생성중에 발생하는 예외상황");
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