package Day220919;

public class A05_if04 {
	public static void main(String[] args) {
		String str1 = "java";
		String str2 = "JAVA";
		
		if(str1 == str2) {
			System.out.println("�� ���ڿ��� ����.");
			System.out.println(str1 + " == " + str2);
		}else {
			System.out.println("�� ���ڿ��� ���� �ʴ�.");
			System.out.println(str1 + " != " + str2);
		}
		System.out.println("if~else������ �ݵ�� ��, �����߿� �� �� �� �����.");
		System.out.println("------------------------------------------");
		
		if(str1.equalsIgnoreCase(str2)) {	//if(str1==str2) ��ҹ��� ����x
			System.out.println("�� ���ڿ��� ����.");
			System.out.println(str1 + " == " + str2);
		}else {
			System.out.println("�� ���ڿ��� ���� �ʴ�.");
			System.out.println(str1 + " != " + str2);
		}
		System.out.println("if~else������ �ݵ�� ��, �����߿� �� �� �� �����.");
		System.out.println("------------------------------------------");
	}
}
