package com.mac.synchronizationExample1;

import java.util.Scanner;

public class Customer {
	int amount = 1000;
	
	synchronized void withdraw(int amount) throws InterruptedException {
		System.out.println("going to withdraw...");
		Thread.sleep(1000);
		
		if (this.amount < amount) {
			System.out.println("Less balance. deposit first..");
			
			wait();
		}
		
		this.amount -= amount;
		System.out.println("Withdrawn. Amount left = " + this.amount);
		
	}
	
	synchronized void deposit(int amount) throws InterruptedException {
		
		
		System.out.println("depositing..");
		Thread.sleep(1000);
		this.amount += amount;
		System.out.println("deposit completed..");
		notify();
	}
	
	
}
