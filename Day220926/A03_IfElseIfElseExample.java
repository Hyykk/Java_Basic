package Day220926;

public class A03_IfElseIfElseExample {
	public static void main(String[] args) {
		int score = 75;
		
		if(score>=90) {
			System.out.println("점수가 100~90 입니다.");
			System.out.println("등급은 A 입니다.");
		} else if(score>=80) {
			System.out.println("점수가 80~90 입니다.");
			System.out.println("등급은 B 입니다.");
		} else if(score>=70) {
			System.out.println("점수가 70~80 입니다.");
			System.out.println("등급은 C 입니다.");
		} else if(score>=60) {
			System.out.println("점수가 70보다 작습니다.");
		}
	}
}
