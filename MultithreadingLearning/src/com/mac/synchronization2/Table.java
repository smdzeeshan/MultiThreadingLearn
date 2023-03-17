package com.mac.synchronization2;

public class Table {
	synchronized static void printTable(int n) {
		for(int i=1;i<=10;i++){    
			System.out.println(n*i + " by thread " + Thread.currentThread().getName());
		     try{    
		       Thread.sleep(400);    
		     }catch(Exception e){}    
		   }    
	}
}
