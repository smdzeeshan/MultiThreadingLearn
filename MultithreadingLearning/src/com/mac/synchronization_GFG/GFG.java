package com.mac.synchronization_GFG;

public class GFG {
	public static void main(String[] args) {
		
		Line obj = new Line();
		Train train1 = new Train(obj);
		Train train2 = new Train(obj);
		
		train1.start();
		train2.start();
		
	}
}
