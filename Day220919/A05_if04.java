package Day220919;

public class A05_if04 {
	public static void main(String[] args) {
		String str1 = "java";
		String str2 = "JAVA";
		
		if(str1 == str2) {
			System.out.println("두 문자열이 같다.");
			System.out.println(str1 + " == " + str2);
		}else {
			System.out.println("두 문자열이 같지 않다.");
			System.out.println(str1 + " != " + str2);
		}
		System.out.println("if~else문장은 반드시 참, 거짓중에 한 블럭 꼭 실행됨.");
		System.out.println("------------------------------------------");
		
		if(str1.equalsIgnoreCase(str2)) {	//if(str1==str2) 대소문자 구별x
			System.out.println("두 문자열이 같다.");
			System.out.println(str1 + " == " + str2);
		}else {
			System.out.println("두 문자열이 같지 않다.");
			System.out.println(str1 + " != " + str2);
		}
		System.out.println("if~else문장은 반드시 참, 거짓중에 한 블럭 꼭 실행됨.");
		System.out.println("------------------------------------------");
	}
}
