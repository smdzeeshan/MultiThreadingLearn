package com.mac.synchronization_GFG;

public class Line {
	synchronized public void getline() throws InterruptedException {
		for (int i = 0; i < 3; i++) {
			System.out.println(i);
			Thread.sleep(400);
		}
	}
}
