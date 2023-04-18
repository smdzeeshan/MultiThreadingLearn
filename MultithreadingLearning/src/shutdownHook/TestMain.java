package shutdownHook;

public class TestMain {
	public static void main(String[] args) throws InterruptedException{
		Thread t1 = new ShutdownHookClass("z1 thread");
		t1.start();
		t1.interrupt();
		Runtime.getRuntime().addShutdownHook(new Thread(new Runnable() {
			
			@Override
			public void run() {
				System.out.println("Shutdown hook running..");
			}
		}));
	}
}
