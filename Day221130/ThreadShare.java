package Day221130;

class Balance {
	private int count = 0;
	
	public void setIncrement() {
		this.count++;
	}
	public void setDecrement() {
		this.count--;
	}
	public int getCount() {
		return this.count;
	}
}

class DuckRun extends Thread {
	Balance balance;
	
	public DuckRun(Balance balance) {
		this.balance = balance;
	}
	
	@Override
	public void run() {
		int i = 0;
		while(i<20000) {
			this.balance.setIncrement();
			this.balance.setDecrement();
			
			if(i%40 == 0) {
				System.out.println(balance.getCount());
			}
			try {
				Thread.sleep((int)(Math.random()*2));
			} catch(InterruptedException e) {
				e.printStackTrace();
			}
			i++;
		}
	}
}

public class ThreadShare {
	public static void main(String[] args) {
		Balance balance = new Balance();
		
		(new DuckRun(balance)).start();
		(new DuckRun(balance)).start();
		(new DuckRun(balance)).start();
		(new DuckRun(balance)).start();
	}
}
