package com.mac.ExecutorServiceLearn;

public class ThreadEnumerateDemo extends Thread {

	ThreadEnumerateDemo(String tName, ThreadGroup tgrp) {
		super(tgrp, tName);
		start();
	}

	public void run() {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			System.out.println("The exception has been encountered " + e);
		}
	}

	public static void main(String[] args) {

		ThreadGroup tg = new ThreadGroup("the parent group");
		ThreadGroup tg1 = new ThreadGroup(tg, "the child group");

		ThreadEnumerateDemo th1 = new ThreadEnumerateDemo("first", tg);
		System.out.println("Starting the first");

		ThreadEnumerateDemo th2 = new ThreadEnumerateDemo("second", tg);
		System.out.println("Starting the second");

		Thread[] grp = new Thread[tg.activeCount()];
		int cnt = tg.enumerate(grp);

		for (int j = 0; j < cnt; j++) {
			System.out.println("Thread " + grp[j].getName() + " is found.");
		}

	}

}
