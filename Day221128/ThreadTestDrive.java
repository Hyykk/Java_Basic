package Day221128;

class MyRunnable implements Runnable{
	@Override
	public void run() {	//스레드가 수행해야할 함수:run()
		go();
	}
	public void go() {
		domore();
	}
	public void domore() {
		System.out.println("Top on the Stack");
	}
}

public class ThreadTestDrive {
	public static void main(String[] args) throws InterruptedException {	// main() 메소드도 스레드
		MyRunnable rb = new MyRunnable();		//스레드가 해야될 일(작업, 로직)
		Thread t1 = new Thread(rb);				//Thread()는 작업을 하는 스레드
		t1.start();

		Thread.sleep(3000);
		System.out.println("Back in the Main");
	}
}
