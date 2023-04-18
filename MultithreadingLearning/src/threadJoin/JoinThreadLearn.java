package threadJoin;

public class JoinThreadLearn extends Thread{
	public void run() {
		for (int i = 0; i < 5; i++) {
			try {
				Thread.sleep(500);
				Thread.currentThread().interrupt();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(i);
		}
	}
}
