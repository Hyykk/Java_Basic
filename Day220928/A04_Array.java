package Day220928;

public class A04_Array {
	public static void main(String[] args) {
		int [] array = new int[100];
		
		for(int i = 0; i < array.length; i++) {
			array[i] = i+1;		//array[0] = 1; array[1] = 2; ...과 같음
		}
		System.out.println(array[99]);
		
		int tot = 0;	//1~100합 저장변수
		for(int i = 0; i < array.length; i++) {
			tot = tot + array[i];
		}
		System.out.println(tot);
	}
}
