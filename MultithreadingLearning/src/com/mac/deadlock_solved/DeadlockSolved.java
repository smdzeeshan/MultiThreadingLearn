package com.mac.deadlock_solved;

public class DeadlockSolved {
	public static void main(String[] args) {
		 DeadlockSolved test = new DeadlockSolved();  
		 
		 final Resource1 a = new Resource1();  
	     final Resource2 b = new Resource2();  
		
		Runnable r1 = new Runnable() {
			
			@Override
			public void run() {
				synchronized (b) {
					try {
						Thread.sleep(100);
					}catch (Exception e) {
						e.printStackTrace();
					}
					synchronized (a) {  
		                System.out.println("In block 1");  
		            }  
				}
				
			}
		};
	}
}
