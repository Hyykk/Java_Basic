package Day220919;

public class A12_Switch {
	public static void main(String[] args) {
		String month = "2월";
		
		switch (month) {
			case "1월": case "3월": case "5월": case "7월": case "8월": case "10월": case "12월":
				System.out.println("31일까지 있는 달");
				break;
			case "4월": case "6월": case "9월": case "11월":
				System.out.println("30일까지 있는 달");
				break;
			case "2월":
				System.out.println("28일 또는 29일 있는 달");
				break;
			default:
				System.out.println("잘못 입력된 달.");
				break;
		}
	}
}
