package threadCreatiion;

public class RunnableWay implements Runnable {

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName() + " is created ");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
		}
		System.out.println(Thread.currentThread().getName() + " is ended ");
	}
	
	public static void main(String[] args) {
		Thread t1 = new Thread(new RunnableWay(), "Thread z1");
		t1.start();
		
		Thread t2 = new Thread(new RunnableWay());
		t2.start();
		
		Thread t3 = new Thread(new RunnableWay());
		t3.start();
	}

}
