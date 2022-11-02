package Day221102;

class Animal{
	public void print() {
		System.out.println("Animal");
	}
}
class Cow extends Animal{
	@Override
	public void eat() {
		
	}
}
class Lion extends Animal{
	
}

public class A03_TestTest {
	public static void main(String[] args) {
		Cow cow = new Cow();
		cow.print();
		
		Lion lion = new Lion();
		lion.print();
	}
}
