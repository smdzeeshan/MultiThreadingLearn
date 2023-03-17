package com.mac.synchronization_GFG;

public class Train extends Thread {
	Line line;
	
	public Train (Line line) {
		this.line = line;
	}
	
	@Override
	public void run() {
		try {
			line.getline();
		} catch (InterruptedException e) {
		}
	}
}
