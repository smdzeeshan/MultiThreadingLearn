package com.Thread.Runtime;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class MemoryTest {
	public static void main(String[] args) throws InterruptedException, UnknownHostException {
		Runtime r = Runtime.getRuntime();
		System.out.println("Free memory is: " + r.freeMemory() / (1024.0 * 1024.0 ));
		System.out.println("Total memory is: " + r.totalMemory() / (1024.0 * 1024.0 ));
		
		System.out.println(InetAddress.getLocalHost().getHostName());
		
		for (int i = 0; i < 1000; i++) {
			String string = new String("Apple" + i);
			new MemoryTest();
		}
		
		System.out.println("Free memory is: " + r.freeMemory() / (1024.0 * 1024.0 ));
		System.out.println("Total memory is: " + r.totalMemory() / (1024.0 * 1024.0 ));
		
		System.gc();  
		Thread.sleep(10000);
		
		System.out.println("Free memory is: " + r.freeMemory() / (1024.0 * 1024.0 ));
		System.out.println("Total memory is: " + r.totalMemory() / (1024.0 * 1024.0 ));
	}
}
