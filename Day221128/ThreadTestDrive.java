package Day221128;

class MyRunnable implements Runnable{
	@Override
	public void run() {	//�����尡 �����ؾ��� �Լ�:run()
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
	public static void main(String[] args) throws InterruptedException {	// main() �޼ҵ嵵 ������
		MyRunnable rb = new MyRunnable();		//�����尡 �ؾߵ� ��(�۾�, ����)
		Thread t1 = new Thread(rb);				//Thread()�� �۾��� �ϴ� ������
		t1.start();

		Thread.sleep(3000);
		System.out.println("Back in the Main");
	}
}
