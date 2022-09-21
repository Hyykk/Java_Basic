package Day220921;

public class A03_Loop {
	public static void main(String[] args) {	//무한 반복
		int cnt = 1;
		
		while(true) {
			System.out.println(cnt);
			cnt = cnt + 2;
			
			if(cnt == 9)
				break;
		}
	}
}
