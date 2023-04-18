package shutdownHook;

public class ShutdownHookClass extends Thread {
	
	public ShutdownHookClass(String name) {
		super(name);
	}
	
	public void run() {
		System.out.println(Thread.currentThread().getName() + " has started");
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			e.printStackTrace();
			System.exit(1);
		}
		System.out.println(Thread.currentThread().getName() + " has ended");
	}
	
	
}
