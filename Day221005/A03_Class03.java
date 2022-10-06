package Day221005;
class Shape {
	public void rotate() {
		System.out.println("도형이 클릭되면 회전하는 메소드");
	}
	public void playSound() {
		System.out.println("aif란 음악파일을 실행");
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
		System.out.println("아메바 모양은 회전시 X, Y를 기준으로 회전한다.");
	}
	@Override
	public void playSound() {
		System.out.println("hif란 음악파일을 실행");
	}
}

public class A03_Class03 {
	public static void main(String[] args) {
		Triangle tri = new Triangle();	// 삼각형 객체 생성.
		tri.rotate();
		tri.playSound();
		
		Amoeba amo = new Amoeba();
		amo.rotate();
		amo.playSound();
	}
}
