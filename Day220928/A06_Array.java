package Day220928;

public class A06_Array {
	public static void main(String[] args) {
		//argument 1~10까지 넣어서 더하기
		
		int[] inval = new int[10];
		
		for(int i = 0; i < inval.length; i++) {
			inval[i] = Integer.parseInt(args[i]);
		}
		int sum = 0;
		for(int i = 0; i < inval.length; i++) {
			sum = sum + inval[i];
		}
		System.out.println("1+2+...+10=" + sum);
	}
}
