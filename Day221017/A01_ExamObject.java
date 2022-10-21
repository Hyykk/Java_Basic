package Day221017;

class DuckObj{
	public int duckSize;
	public String duckName;
	public double duckHeight;
	public void setDuck(int size, String name, double height) {
		duckSize = size;
		duckName = name;
		duckHeight =height;
	}
	public int getDuckSize() {
		return duckSize;
	}
	public String getDuckName() {
		return duckName;
	}
	public double getDuvkHeight() {
		return duckHeight;
	}
}

public class A01_ExamObject {
	public static void main(String[] args) {
		DuckObj duo = new DuckObj();	//Construct Object
		duo.setDuck(250, "Water Duck", 25.3);
		
		System.out.println(duo.getDuckName() + ":" + duo.getDuckSize() + ":" + duo.duckHeight);
	}
}
