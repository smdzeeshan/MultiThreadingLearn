

public class myJava extends Thread{
	
	public void run() {
		System.out.println("Cleaning the resources using shutdown hook....");
	}
	
	public static void main(String[] args) throws InterruptedException {
		myJava mj = new myJava();
		Runtime.getRuntime().addShutdownHook(mj);
		Runtime.getRuntime().removeShutdownHook(mj);
		System.out.println("Main thread going to sleep for 100 secs... hit ctrl+c to exit...");
		Thread.sleep(100000);
		
	}
}
