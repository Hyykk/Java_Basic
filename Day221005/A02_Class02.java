package Day221005;

class Duck02{
	public void printDuck02() {
		System.out.println("Duck02 Object!!!");
	}
}

class RedHeadDuck02 extends Duck02{
	@Override	//  �޼ҵ� ���ڵ�(������)
	public void printDuck02() {
		System.out.println("RedHeadDuck02 Object!!!");
		System.out.println("RedHadDuck02 Object~~~");
	}
}

class WaterDuck02 extends Duck02{	//	extends : ��� �Ǵ� Ȯ��(�޼ҵ�)
}

public class A02_Class02 {
	public static void main(String[] args) {
		RedHeadDuck02 rd02 = new RedHeadDuck02();
		rd02.printDuck02();
		
		WaterDuck02 wd2 = new WaterDuck02();	// ��ü ����
		wd2.printDuck02();
	}
}
