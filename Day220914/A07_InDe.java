package Day220914;

public class A07_InDe {
	public static void main(String[] args) {
		int x = 1;
		int q = 0;
		
		q = x++ + 2;	//x+2를 q에 대입후에 x에 1증가(후위연산자)
		System.out.println(q);
		
		q = ++x + 2;	//x에 1증가후에 x+2를 q에 대입(전위연산자)
		System.out.println(q);
		
		x++;			// x = x + 1;
		++x;			// x = x + 1;
		System.out.println(x);
	}
}
