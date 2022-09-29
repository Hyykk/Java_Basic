package Day220926;

public class A01_IfExample {
	public static void main(String[] args) {
		int score = 93;
		
		if(score>=90) {	// score조건 결과에 따라서, 8번 9번 문장 수행
			System.out.println("점수가 90보다 큽니다.");
			System.out.println("등급은 A 입니다.");
		}
		
		if(score < 90)	//score조건 결과에 따라서, 11번 12번 문장 수행
			System.out.println("점수가 90보다 작습니다.");
			System.out.println("등급은 B 입니다.");
	}
}
