package com.mac.synchronization_GFG_blockSync;

import java.util.ArrayList;
import java.util.List;

public class GFG extends Thread{
	
	List<String> list = new ArrayList<>();
	static int res;
	@Override
	public void run() {
		Geek gk = new Geek();
		res = gk.geekName(Thread.currentThread().getName(), list);
		
	}
	
	public static void main(String[] args) {

		Thread t1 = new GFG();
		Thread t2 = new GFG();
		t1.start();
		t2.start();
		System.out.println(res);
		
		
		
		
		
	}
}
