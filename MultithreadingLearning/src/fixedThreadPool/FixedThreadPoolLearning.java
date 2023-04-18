package fixedThreadPool;

public class FixedThreadPoolLearning implements Runnable{

	private int message;
	
	public FixedThreadPoolLearning(int message) {
		this.message = message;
	}
	
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName() + " has started with message = " + message);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName() + " has ended with message = " + message);
	}

}
