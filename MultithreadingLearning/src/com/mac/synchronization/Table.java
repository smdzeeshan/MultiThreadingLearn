package com.mac.synchronization;

public class Table {
	void printTable (int n) {
		synchronized (this) {
			for (int i = 0; i < 5; i++) {
				System.out.println(n*i + " by thread " + Thread.currentThread().getName());
				try {
					Thread.sleep(400);
				}
				catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
		
	}
}
