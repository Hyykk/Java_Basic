package Day220926;

public class A03_IfElseIfElseExample {
	public static void main(String[] args) {
		int score = 75;
		
		if(score>=90) {
			System.out.println("������ 100~90 �Դϴ�.");
			System.out.println("����� A �Դϴ�.");
		} else if(score>=80) {
			System.out.println("������ 80~90 �Դϴ�.");
			System.out.println("����� B �Դϴ�.");
		} else if(score>=70) {
			System.out.println("������ 70~80 �Դϴ�.");
			System.out.println("����� C �Դϴ�.");
		} else if(score>=60) {
			System.out.println("������ 70���� �۽��ϴ�.");
		}
	}
}
