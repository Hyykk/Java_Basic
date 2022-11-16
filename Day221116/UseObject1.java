package Day221116;

class SingletonOne{
	private static SingletonOne instance = new SingletonOne();
	private SingletonOne() {
		System.out.println("SingletonOne constructed");
	}
	public static SingletonOne getInstance() {
		return instance;
	}
}

public class UseObject1 {
	public static void main(String[] args) {
		SingletonOne s1 = SingletonOne.getInstance();
		SingletonOne s2 = SingletonOne.getInstance();
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
	}
}
