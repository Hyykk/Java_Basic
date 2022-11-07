package Day221107;

interface Pet{	// interface�� ���� �߻�޼ҵ常 ����(��� �� ������), ������ ��Ӱ�����.
	abstract public void playing();
}

abstract class Animal01{	// ���߻���� �Ұ���
	abstract public void eating();
	public void moving() {
		System.out.println("animal is moving");
	}
}

class Tiger01 extends Animal01{
	@Override
	public void eating() {
		System.out.println("Tiger eats meat.");
	}
}

class Dog01 extends Animal01 implements Pet{
	@Override
	public void eating() {
		System.out.println("Dog eats");
	}
	@Override
	public void playing() {
		System.out.println("Dog is playing.");
	}
}

class Wolf01 extends Animal01{
	@Override
	public void eating() {
		System.out.println("Wolf eats meat.");
	}
}

class Cat extends Animal01 implements Pet{
	@Override
	public void playing() {
		System.out.println("Cat is playing.");
	}
	@Override
	public void eating() {
		System.out.println("Cat eats");
	}
}

public class A02_Abstract {
	public static void main(String[] args) {
		
	}
}
