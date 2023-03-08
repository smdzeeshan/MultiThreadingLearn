package com.mac.threadGroupLearn;

public class ActiveGroupCount extends Thread {

	public ActiveGroupCount(String name, ThreadGroup tg) {
		super(tg, name);
		start();
	}

	public void run() {
		System.out.println(Thread.currentThread().getName() + " is started...");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		System.out.println(Thread.currentThread().getName() + " is ended... ");
	}

	public static void main(String[] args) {

		ThreadGroup tg1 = new ThreadGroup("tg1");
		Thread t1 = new ActiveGroupCount("t1", tg1);

		ThreadGroup tg2 = new ThreadGroup(tg1, "tg2");
		Thread t2 = new ActiveGroupCount("t2", tg2);
		
		System.out.println(tg1.activeGroupCount());

	}
}
