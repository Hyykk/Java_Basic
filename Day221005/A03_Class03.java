package Day221005;
class Shape {
	public void rotate() {
		System.out.println("������ Ŭ���Ǹ� ȸ���ϴ� �޼ҵ�");
	}
	public void playSound() {
		System.out.println("aif�� ���������� ����");
	}
}

class Square extends Shape{public Square() {

}
class Circle extends Shape{
	
}
class Triangle extends Shape{
	
}
class Amoeba extends Shape{
	@Override
	public void rotate() {
		System.out.println("�Ƹ޹� ����� ȸ���� X, Y�� �������� ȸ���Ѵ�.");
	}
	@Override
	public void playSound() {
		System.out.println("hif�� ���������� ����");
	}
}

public class A03_Class03 {
	public static void main(String[] args) {
		Triangle tri = new Triangle();	// �ﰢ�� ��ü ����.
		tri.rotate();
		tri.playSound();
		
		Amoeba amo = new Amoeba();
		amo.rotate();
		amo.playSound();
	}
}
