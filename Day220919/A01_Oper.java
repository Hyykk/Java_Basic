package Day220919;

public class A01_Oper {
	public static void main(String[] args) {
		//보수 연산: 1의 보수/ 2의 보수 (음수연산) 9 - 4 = 5 + 9 + (-4) = +5
		//- 1의 보수: 10진수 2진수변환 -> 0->1, 1->0
		//- 2의 보수: 1의보수에서 +1을 해주면 2의 보수가 됨.
		// : 특정숫자를 1의 보수 -> 2의 보수 : 숫자에 부호가 바뀜
		
		int number = -200;
		System.out.println("number : " + number);
		
		int n1 = ~number;	// -200에 1의 보수
		System.out.println("number 1의 보수: " + n1);
		
		int n2 = n1 + 1;	// 1의 보수결과 + 1
		System.out.println("number 2의 보수: " + n2);
		
		int score = 55;
		int res = (~score) + 1;
		System.out.println(score + " : " + res);
		
		//시프트 연산자는 비트에 위치를 이동시켜서 숫자를 연산하는 방법.
		int inval = 100;
		System.out.println("100쉬프트이동 : " + inval);
		
		int shiftR = inval >> 1;
		System.out.println("100 오른쪽 쉬프트 1이동: " + shiftR);
		
		int shiftR1 = shiftR >> 1;
		System.out.println("100 오른쪽 쉬프트 1이동: " + shiftR1);
		
		int shiftR2 = shiftR1 >> 1;
		System.out.println("100 오른쪽 쉬프트 1이동: " + shiftR2);
		
		int temp = 100;
		int shifttemp = temp << 1;
		System.out.println("100 왼쪽 쉬프트 1이동: " + shifttemp);
		
		int a1 = 4, a2 = 2;
		int s = a1 & a2;	//숫자를 2진수 변환 후에 각 비트 순서대로 &연산을 한다.
							//&연산은 2개의 2진수에서 양쪽 다 1:1일때만 1로 세트 됨.
		
		System.out.println(s);
	}
}