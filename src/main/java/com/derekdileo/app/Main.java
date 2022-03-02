package com.derekdileo.app;

public class Main {

	public static int fibRecursive(int x) {
		
		if(x <= 1) {
			return x;
		} else {

			return fibRecursive(x - 1) + fibRecursive(x - 2);
			
		}
		
	}
	
}
