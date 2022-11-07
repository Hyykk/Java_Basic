package Day221107;
// �߻� Ŭ���� : ��ü ��Ӱ��� ���� Ŭ����, �ݵ�� ���� Ŭ������ Ȯ��, ����ؾ��ϸ� 1�� �̻��� �߻�޼ҵ带 ����
// �߻� �޼ҵ� : �߰�ȣ ����, ������ ��ȭ���� �޼ҵ��(�Ű�����); public void methodName(int s);
// �߻� Ŭ������ new Ű����� ��ü ���� �Ұ�

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