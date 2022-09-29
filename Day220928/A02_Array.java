package Day220928;

public class A02_Array {
	public static void main(String[] args) {
		int[] array = {1,2,3,4,5,6,7,8,9,10};	//배열변수의 초기화
		
		//배열과 for문 응용
		for(int i = 0; i<=9; i++) {
			System.out.println(array[i]);
		}
		
		int c = 0;
		while(c < 10) {
			System.out.println(array[c]);
			c++;
		}
	}
}
