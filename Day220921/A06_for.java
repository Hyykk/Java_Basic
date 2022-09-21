package Day220921;

public class A06_for {
	public static void main(String[] args) {
		//반복의 초기 변수, 조건식, 반복 횟수 카운트가 한문장에 있음.
		int sum = 0;
		for(int i = 1; i <= 100; i++) {
			sum = sum + i;
		}
		System.out.println(sum);
		
		int hol;
		for(int k = 1; k <= 100; k+=2) {
			hol = hol + k;
		}
		System.out.println("hol");
	}
}