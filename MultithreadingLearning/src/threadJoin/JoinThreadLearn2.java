package threadJoin;

public class JoinThreadLearn2 extends Thread {
	public void run() {
		
		System.out.println("JoinThreadLearn2 has started..");
		try {
			
			JoinThreadLearn joinThreadLearn = new JoinThreadLearn();
			
			joinThreadLearn.start();
			Thread.sleep(1500);
			joinThreadLearn.join();
			System.out.println("JoinThreadLearn2 has ended");
		} catch (InterruptedException e) {
			System.out.println("int");
		}
		
		
	}
}
