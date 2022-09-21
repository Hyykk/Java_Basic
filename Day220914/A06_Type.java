package Day220914;

public class A06_Type {
	public static void main(String[] args) {
		int x = 50000;
		long y;
				// long > int(메모리 크기)
		y = x;	// int타입의 변수 x값을 long타입의 y변수에 저장.
		System.out.println(y);
		
		long w = 1243L;
		int q;
		
		//q = w;	에러 발생 : long < int == false
		q = (int)w;	//int형의 w변수값을 강제로 int형으로 변환해서 저장.
		System.out.println(q);
	}
}
