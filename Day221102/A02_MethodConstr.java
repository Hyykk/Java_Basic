package Day221102;

class QWER {
	private int speed;
	
	public QWER() {
		System.out.println("QWER");
	}
	public void ptrQWER() {
		System.out.println("ptrQWER() Method");
	}
	public void getQWER() {
		System.out.println("getQWER() Method");
	}
	protected void QWERqwer() {
		System.out.println("QWERqwer() Method");
	}
	
	public int getSpeed(){
		return this.speed;
	}
	public void setSpeed(int speed){
		this.speed = speed;
	}
}

class ASDF extends QWER{
	private int speed;
	
	public ASDF() {
		System.out.println("ASDF");
	}
	@Override
	public void setSpeed(int speed) {
		if(speed < 0) {
			System.out.println("Error: speed must be larger than 0");
			this.speed = 0;
		}
		else {
			this.speed = speed;
		}
	}
}

public class A02_MethodConstr {
	public static void main(String[] args) {
		new ASDF();
	}
}
