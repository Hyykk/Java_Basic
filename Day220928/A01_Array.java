package Day220928;

public class A01_Array {
	public static void main(String[] args) {
		int[] array = new int[5];
		
		System.out.println(array);
		System.out.println(array[0]);	//�迭 5�� -> 0 ~ 4
		System.out.println(array[1]);
		System.out.println(array[2]);
		System.out.println(array[3]);
		System.out.println(array[4]);
		
		//�迭 Ȱ���� �Ϲ� ������ ����, ��� �ε��� ��ȣ�� ������.
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
