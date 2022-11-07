package Day221107;
// 추상 클래스 : 객체 상속간의 상위 클래스, 반드시 하위 클래스로 확장, 상속해야하며 1개 이상의 추상메소드를 보유
// 추상 메소드 : 중괄호 없이, 접근자 바화뉴형 메소드명(매개변수); public void methodName(int s);
// 추상 클래스는 new 키워드로 객체 생성 불가

abstract class Animal{
	abstract public void eating();
	public void moving() {
		System.out.println("animal is moving");
	}
	abstract void playing();
}

class Tiger extends Animal{
	@Override
	public void eating() {
		System.out.println("Tiger eats meat.");
	}
	@Override
	public void playing() {
	}
}

class Cow extends Animal{
	@Override
	public void eating() {
		System.out.println("Cow eats grass.");
	}
	@Override
	public void playing() {
	}
}

class Dog extends Animal{
	@Override
	public void eating() {
	}
	@Override
	public void playing() {
		System.out.println("Dog is playing.");
	}
}

public class A01_Abstract {
	public static void main(String[] args) {
		// Animal a = new Animal(); (Cannot instantiate the type Animal)
		Tiger ti = new Tiger();
		ti.eating();
		Cow co = new Cow();
		co.eating();
		
		Dog dog = new dog();
		dog.playing();
	}
}