package Day221109;

interface FlyBehavior{
	public void fly();
}

class FlyWithWings implements FlyBehavior{
	@Override
	public void fly() {
		System.out.println("Fly With Wings");
	}
}

class FlyNoWay implements FlyBehavior{
	@Override
	public void fly() {
		System.out.println("Fly No way");
	}
}

interface QuackBehavior{
	public void quack();
}

class Quack implements QuackBehavior{
	@Override
	public void quack() {
		System.out.println("Quack");
	}
}
class MuteQuack implements QuackBehavior{
	@Override
	public void quack() {
		System.out.println("Mute");
	}
}

interface SwimBehavior{
	public void swim();
}

class Swim implements SwimBehavior{
	@Override
	public void swim() {
		System.out.println("Swim");
	}
}

abstract class Duck{
	FlyBehavior flyBehavior;	// interface type variable
	QuackBehavior quackBehavior;
	SwimBehavior swimBehavior;
	
	public Duck() {	}
	
	public void setFlyBehavior(FlyBehavior fb) {
		this.flyBehavior = fb;
	}
	public void setQuackBehavior(QuackBehavior qb) {
		this.quackBehavior = qb;
	}
	
	public void performFly() {
		this.flyBehavior.fly();
	}
	public void performQuack() {
		this.quackBehavior.quack();
	}
	public void performSwim() {
		this.swimBehavior.swim();
	}
}

class MallardDuck extends Duck{
	public MallardDuck() {
		flyBehavior = new FlyWithWings();
		quackBehavior = new Quack();
		swimBehavior = new Swim();
	}
	public void display() {
		System.out.println("Mallard Duck");
	}
}

class WoodDuck extends Duck{
	public WoodDuck() {
		flyBehavior = new FlyNoWay();
		quackBehavior = new MuteQuack();
		swimBehavior = new Swim();
	}
	public void display() {
		System.out.println("Wood Duck");
	}
}

public class MinDuckSim {
	public static void main(String[] args) {
		MallardDuck md = new MallardDuck();
		md.display();
		md.performFly();
		md.performQuack();
		md.setFlyBehavior(new FlyNoWay());
		md.performFly();
		md.performSwim();
		
		WoodDuck wd = new WoodDuck();
		wd.display();
		wd.performFly();
		wd.performQuack();
	}
}
