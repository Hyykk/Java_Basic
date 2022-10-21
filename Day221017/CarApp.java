package Day221017;

public class CarApp {
	public static void main(String[] args) {
		Car c2 = new Car();
		c2.carColor = "흰색";
		c2.carName = "OOO";
		c2.carCompany = "PPPP";
		c2.prtCarInfo();
		
		Car c3 = new Car();
				
		Car c1 = new Car();
		c1.carName = "자동차이름";
		c1.carColor = "블랙";
		c1.carCompany = "XXX";
		
		c1.prtCarInfo();
	}
}
