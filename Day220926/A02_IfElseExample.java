package Day220926;

public class A02_IfElseExample {
	public static void main(String[] args) {
		int score = 85;
		
		if(score >= 90) {	//score조건 결과에 따라서 8, 9번을 수행하거나 11, 12번을 수행함
			System.out.println("점수가 90보다 큽니다.");
			System.out.println("등급은 A 입니다.");
		} else {			//else만 있는 경우는 조건식을 절대 넣지 않는다.
			System.out.println("점수가 90보다 작습니다.");
			System.out.println("등급은 B 입니다.");
		}
	}
}
