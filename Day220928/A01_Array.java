package Day220928;

public class A01_Array {
	public static void main(String[] args) {
		int[] array = new int[5];
		
		System.out.println(array);
		System.out.println(array[0]);	//배열 5개 -> 0 ~ 4
		System.out.println(array[1]);
		System.out.println(array[2]);
		System.out.println(array[3]);
		System.out.println(array[4]);
		
		//배열 활용은 일반 변수와 같음, 대신 인덱스 번호로 제어함.
		array[0] = 100;
		array[1] = 200;
		array[2] = 300;
		array[3] = 400;
		array[4] = -500;
		
		System.out.println(array[0]);
		System.out.println(array[1]);
		System.out.println(array[2]);
		System.out.println(array[3]);
		System.out.println(array[4]);
	}
}
