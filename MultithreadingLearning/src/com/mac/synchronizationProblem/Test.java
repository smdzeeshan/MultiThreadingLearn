package com.mac.synchronizationProblem;

public class Test extends Thread {
	int i = 0;

	@Override
	synchronized public void run() {
		System.out.println(Thread.currentThread().getName() + " is started");
		for (int m = 0; m < 5; m++) {
			try {
				Thread.sleep(1000);
			} 
			catch (InterruptedException e) {
				e.printStackTrace();
			}
			i = i + 1;
			System.out.println(i);
		}

		
	}

}
