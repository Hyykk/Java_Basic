package Day220928;

public class A03_Array {
	public static void main(String[] args) {
		double[]score= {90.1,90.2,90.3,90.4,90.5};
		
		for(int i = 0; i < score.length; i++) {	//score.length는 배열의 개수를 알려줌.c에서는 sizeof
			System.out.println(score[i]);
		}
		System.out.println("-------------------------");
		for(int i = score.length-1; i>=0; i--) {
			System.out.println(score[i]);
		}
	}
}
