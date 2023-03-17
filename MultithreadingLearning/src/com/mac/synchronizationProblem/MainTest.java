package com.mac.synchronizationProblem;

public class MainTest {
	public static void main(String[] args) {
		Test t = new Test();
		
		Thread t1 = new Thread(t);
		Thread t2 = new Thread(t);
		t1.start();
		t2.start();
		
		
	}
}
