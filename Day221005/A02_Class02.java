package Day221005;

class Duck02{
	public void printDuck02() {
		System.out.println("Duck02 Object!!!");
	}
}

class RedHeadDuck02 extends Duck02{
	@Override	//  메소드 재코드(재정의)
	public void printDuck02() {
		System.out.println("RedHeadDuck02 Object!!!");
		System.out.println("RedHadDuck02 Object~~~");
	}
}

class WaterDuck02 extends Duck02{	//	extends : 상속 또는 확장(메소드)
}

public class A02_Class02 {
	public static void main(String[] args) {
		RedHeadDuck02 rd02 = new RedHeadDuck02();
		rd02.printDuck02();
		
		WaterDuck02 wd2 = new WaterDuck02();	// 객체 생성
		wd2.printDuck02();
	}
}
