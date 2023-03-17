package com.mac.synchronization_GFG_blockSync;

import java.util.List;

public class Geek {
	String name = "";
	public int count = 0;
	
	synchronized public int geekName(String geek, List<String> list) {
		synchronized (this) {
			name = geek;
			count++;
		}
		
		list.add(name);
		return count;
	}
}
