package Day220914;

public class A08_Compare {
	public static void main(String[] args) {
		
		double m = 3.4;
		double n = 2.5;
		System.out.println(m == n);	//false
		System.out.println(m != n);	//true
		
		char ap1 = 'A';	//ASCII 65
		char ap2 = 'a';	//ASCII 79
		System.out.println(ap1 == ap2);	//false
		System.out.println(ap1 != ap2);	//true
		
		String str1 = "Hello";
		String str2 = "hello";
		System.out.println(str1 == str2);	//false
		System.out.println(str1 != str2);	//true
		
		boolean result1 = str1.equals(str2);	//같으면 true 다르면 false
		boolean result2 = str1.equalsIgnoreCase(str2);	//대소문자 구별x
		System.out.println(result1);
		System.out.println(result2);
	}
}
