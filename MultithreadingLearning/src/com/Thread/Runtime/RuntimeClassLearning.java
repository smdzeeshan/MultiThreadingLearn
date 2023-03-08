package com.Thread.Runtime;

import java.io.IOException;

public class RuntimeClassLearning {
	public static void main(String[] args) throws IOException {
		
		int processors = Runtime.getRuntime().availableProcessors();
		System.out.println("Available processors in the system are: " + processors);
		
		System.out.println(Runtime.getRuntime().exec("notepad"));
		
	}
}
