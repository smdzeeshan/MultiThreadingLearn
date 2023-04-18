package threadSleep;

public class SleepMethodRun extends Thread {
	public void run() {
		System.out.println(Thread.currentThread().getName() + " is started");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		System.out.println(Thread.currentThread().getName() + " is ended");
	}
	
	public static void main(String[] args) {
		SleepMethodRun sleepMethodRun = new SleepMethodRun();
		sleepMethodRun.start();
		//sleepMethodRun.interrupt();
		
	}
}
