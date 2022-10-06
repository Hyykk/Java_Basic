package Day221005;

class Duck01 {
	public Duck01() {
		System.out.println("Duck01 Objected Instance!!!");
	}
}

public class A01_Class01 {
	public static void main(String[] args) {
		new Duck01();	// 힙메모리(가상메모리) Duck객체 생성 == 할당
	}
}
