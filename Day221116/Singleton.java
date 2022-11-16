package Day221116;

// 객체생성을 하고 프로그램 실행중에 특정 객체가 메모리상에 단독으로 있어야 되는 경우 사용하는 패턴
// 싱글턴 패턴 : 메모리상의 유일무이한 객체
//				네트워크연결, 데이터베이스 연결 -> 그 연결객체도 1개만 존재하는 경우
//				생성자가 객체를 한번만 생성하게 하고 두번째 생성부터는 제한



public class Singleton {
	private static Singleton instance = new Singleton();
	// static변수는 메모리 상에서 1개만 존재
	
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
