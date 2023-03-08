package com.mac.ShutdownhookDemo;

public class RemoveShutdownhook {
	
	public void run() {
		System.out.println("Cleaning the resources using shutdown hook....");
	}
	
	public static void main(String[] args) throws InterruptedException {
		Runtime.getRuntime().addShutdownHook(new AddShutdownHookDemo());
		System.out.println("Main thread going to sleep for 100 secs... hit ctrl+c to exit...");
		Thread.sleep(100000);
		Runtime.getRuntime().removeShutdownHook(new AddShutdownHookDemo());
	}
}
