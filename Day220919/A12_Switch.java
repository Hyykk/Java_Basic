package Day220919;

public class A12_Switch {
	public static void main(String[] args) {
		String month = "2��";
		
		switch (month) {
			case "1��": case "3��": case "5��": case "7��": case "8��": case "10��": case "12��":
				System.out.println("31�ϱ��� �ִ� ��");
				break;
			case "4��": case "6��": case "9��": case "11��":
				System.out.println("30�ϱ��� �ִ� ��");
				break;
			case "2��":
				System.out.println("28�� �Ǵ� 29�� �ִ� ��");
				break;
			default:
				System.out.println("�߸� �Էµ� ��.");
				break;
		}
	}
}
