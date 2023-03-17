package com.mac.synchronizationExample1;

public class TestMain {
	public static void main(String[] args) {
		Customer cust = new Customer();
		new Thread() {
			@Override
			public void run() {
				try {
					cust.withdraw(10000);
				} catch (InterruptedException e) {
				}
			}
		}.start();
		
		
		new Thread() {
			@Override
			public void run() {
				try {
					cust.deposit(10000);
				} catch (InterruptedException e) {
				}
			}
		}.start();
	}
}
