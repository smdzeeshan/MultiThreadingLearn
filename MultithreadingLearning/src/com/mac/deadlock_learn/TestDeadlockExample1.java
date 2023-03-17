package com.mac.deadlock_learn;

public class TestDeadlockExample1 {
	public static void main(String[] args) {

		final String resource1 = "Zeeshan";
		final String resource2 = "Ravi Raj";

		Thread t1 = new Thread() {
			public void run() {
				synchronized (resource1) {
					System.out.println("Thread 1 : Locked resource1");

					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
					}

					synchronized (resource2) {
						System.out.println("Thread 1 : Locked resource2");
					}
				}
			};

		};

		Thread t2 = new Thread() {
			public void run() {
				synchronized (resource2) {
					System.out.println("Thread 2 : Locked resource2");

					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
					}

					synchronized (resource1) {
						System.out.println("Thread 2 : Locked resource1");
					}
				}
			};
		};
		
		t1.start();
		t2.start();

	}
}
