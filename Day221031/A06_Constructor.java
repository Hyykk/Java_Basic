package Day221031;

class Duck3{
	private int duckSize;
	
	public Duck3() {
		this.duckSize = 100;
	}
	public Duck3(int duckSize) {
		this.duckSize = duckSize;
	}
	public void setDuckSize(int duckSize) {
		this.duckSize = duckSize;
	}
}

public class A06_Constructor {
	public static void main(String[] args) {
		Duck3 d3 = new Duck3(5000);
		Duck3 d4 = new Duck3();
		d4.setDuckSize(10000);
	}
}
