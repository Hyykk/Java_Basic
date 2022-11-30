package Day221130;

class BankAccount{
	private int balance = 500000;	//초기값 지정
	
	public void withdraw(int amount) {
		this.balance = this.balance - amount;
	}
	public int getBalance() {
		return this.balance;
	}
}

class RyanAndMonica implements Runnable{
	BankAccount account = new BankAccount();	//공유객체 생성, 참조
	@Override
	public void run() {	//스레드가 해야할 로직
		for(int i=0; i<10; i++) {
			makeWithdrawal(100000);
			
			if(account.getBalance() < 0) {
				System.out.println("잔고가 부족합니다.");
			}
		}
	}
	//synchronized(동기화) : 특정 스레드가 실행상태에서 공유자원(객체)에 단독으로만 접근
	public synchronized void makeWithdrawal(int amount) {
		if(account.getBalance() >= amount) {
			System.out.println(Thread.currentThread().getName() + "의 잔고확인");
			
			account.withdraw(amount);
			System.out.println(Thread.currentThread().getName() + "가 10만원 인출");
			System.out.println("\n 남아있는 통장잔고금액은 " + account.getBalance() + "원 입니다.\n");
		}
		else {
			System.out.println(Thread.currentThread().getName() + "님 잔고가 부족합니다.");
		}
	}
}

public class ConcurrencyThread {
	public static void main(String[] args) {
		//Thread : 일/코드/로직을 수행하는 객체
		//Runnable : 일/코드/로직 그 자체
		RyanAndMonica job = new RyanAndMonica();
		
		Thread ryan = new Thread(job);
		Thread monica = new Thread(job);
		
		ryan.setName("Ryan");
		monica.setName("Monica"); 
		
		ryan.start();
		monica.start();
	}
}