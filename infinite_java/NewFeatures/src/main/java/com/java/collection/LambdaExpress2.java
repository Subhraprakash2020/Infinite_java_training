package com.java.collection;

public class LambdaExpress2 {
	public static void main(String[] args) {
		ICalculation obj1 = (a,b) ->{
			return a+b;
		};
		System.out.println("Sum is "+obj1.calc(12, 5));
		
		ICalculation obj2 = (a,b) ->{
			return a-b;
		};
		System.out.println("Sum is "+obj2.calc(12, 5));
	}
}
