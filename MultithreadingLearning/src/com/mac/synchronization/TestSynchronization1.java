package com.mac.synchronization;

public class TestSynchronization1 {
	public static void main(String[] args) {
		Table obj = new Table();
		MyThread1 myThread1 = new MyThread1(obj);
		MyThread2 myThread2 = new MyThread2(obj);
		//myThread1.start();
		//myThread2.start();
		
		Thread myThread3 = new Thread() {
			public void run() {
				obj.printTable(5);
			}
		};
		
		Thread myThread4 = new Thread() {
			public void run() {
				obj.printTable(100);
			}
		};
		
		myThread3.start();
		myThread4.start();
		
	}
}
