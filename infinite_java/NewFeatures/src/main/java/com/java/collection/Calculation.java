package com.java.collection;

public class Calculation {
	int sum(int x, int y) {
		return x+y;
	}
	
	int sub(int x, int y) {
		return x-y;
	}
	int mult(int x, int y) {
		return x*y;
	}
	
	public static void main(String[] args) {
		Calculation obj = new Calculation();
		IMethodRef2 m1 = obj::sum;
		System.out.println("Sum is "+ m1.calc(12, 4));
		
		IMethodRef2 m2 = obj::sub;
		System.out.println("Sub is"+ m2.calc(45, 4));
	}
}
