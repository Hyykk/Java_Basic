package Day220926;

public class A10_Continue {
	public static void main(String[] args) {
		for(int i=1; i<=10; i++) {
			
			if(i%2 != 0) {
				continue;	//	아래의 문장을 수행하지 않고 반복문의 처음으로 돌아감.
			}
			
			System.out.println(i);
		}
	}
}
