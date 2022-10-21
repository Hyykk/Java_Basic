package Day221017;

public class DuckExam {
	public static void main(String[] args) {
		Duck d1 = new Duck();
		System.out.println("d1 : " + d1.hashCode());
		
		Duck d2 = new Duck();
		System.out.println("d2 : " + d2.hashCode());
		
		Duck d3 = new Duck();
		System.out.println("d3 : " + d3.hashCode());
		
		d2 = d3;	//d2 = d3's reference variable
		System.out.println("d2 : " + d2.hashCode());
		System.out.println("d2 : " + d3.hashCode());
	}
}