package Day220921;

public class A01_Loop {
	public static void main(String[] args) {
		//while
		int i = 1;		//반복 시작의 초기변수
		
		int sum = 0;	//누적
		
		while(i <= 10) {	//반복 횟수 결정 : 반복 조건식
			System.out.println(i);	//반복할 코드
			sum = sum + i;
			
			i++;		//반복 횟수 카운트 (제일 마지막에 들어감)
		}
		System.out.println("1+2+3+...+10=" + sum);
	}
}
