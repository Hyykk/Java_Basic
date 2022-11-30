package Day221130;

class BankAccount{
	private int balance = 500000;	//�ʱⰪ ����
	
	public void withdraw(int amount) {
		this.balance = this.balance - amount;
	}
	public int getBalance() {
		return this.balance;
	}
}

class RyanAndMonica implements Runnable{
	BankAccount account = new BankAccount();	//������ü ����, ����
	@Override
	public void run() {	//�����尡 �ؾ��� ����
		for(int i=0; i<10; i++) {
			makeWithdrawal(100000);
			
			if(account.getBalance() < 0) {
				System.out.println("�ܰ� �����մϴ�.");
			}
		}
	}
	//synchronized(����ȭ) : Ư�� �����尡 ������¿��� �����ڿ�(��ü)�� �ܵ����θ� ����
	public synchronized void makeWithdrawal(int amount) {
		if(account.getBalance() >= amount) {
			System.out.println(Thread.currentThread().getName() + "�� �ܰ�Ȯ��");
			
			account.withdraw(amount);
			System.out.println(Thread.currentThread().getName() + "�� 10���� ����");
			System.out.println("\n �����ִ� �����ܰ�ݾ��� " + account.getBalance() + "�� �Դϴ�.\n");
		}
		else {
			System.out.println(Thread.currentThread().getName() + "�� �ܰ� �����մϴ�.");
		}
	}
}

public class ConcurrencyThread {
	public static void main(String[] args) {
		//Thread : ��/�ڵ�/������ �����ϴ� ��ü
		//Runnable : ��/�ڵ�/���� �� ��ü
		RyanAndMonica job = new RyanAndMonica();
		
		Thread ryan = new Thread(job);
		Thread monica = new Thread(job);
		
		ryan.setName("Ryan");
		monica.setName("Monica"); 
		
		ryan.start();
		monica.start();
	}
}