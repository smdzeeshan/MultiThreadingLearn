package com.mac.mainThreadLearn;

public class GFG extends Thread {
	public static void main(String[] args) {
		
		System.out.println(Thread.currentThread().getName() +" is started..");
		
		try {
			Thread.currentThread().join();
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println(Thread.currentThread().getName() +" is ending....");
	}
}
