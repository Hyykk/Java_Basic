package Day220928;

public class A05_Array {
	//	String[] args: 문자열 배열: cmd창 입력으로 들어오는 인수(배열의 형태입력, 문자열, 인덱스번호0부터 시작.)
	
	//	c:\>javac A05_Array.java	->	컴파일 후, 에러가 없으며뉴 A05_Array.class가 생성됨.
	//	c:\>java A05_Array			-> 	실행
	//	c:\>java A05_Array 100 200 300	->	main(): String[] args에 배열형태로 입력됨.
	public static void main(String[] args) {
		System.out.println("args[0]: " + args[0]);
		System.out.println("args[1]: " + args[1]);
		System.out.println("args[2]: " + args[2]);
		
		int a = Integer.parseInt(args[0]);	//args[0] 문자열인 숫자를 정수타입으로 변환
		int b = Integer.parseInt(args[1]);
		int c = Integer.parseInt(args[2]);
		System.out.println(a+b+c);
	}
}
