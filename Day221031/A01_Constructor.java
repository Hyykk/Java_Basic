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
		new Duck();	// 생성자 메소드 호출
					// 생성자는 객체가 new키워드로 생성될 때 가장 먼저 수행되는 메소드
					// 매개변수는 0개 이상, 리턴타입은 존재하지 않음
	}
}
