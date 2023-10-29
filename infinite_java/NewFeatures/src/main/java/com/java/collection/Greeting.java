package com.java.collection;

public class Greeting {
	public static void main(String[] args) {
		IGreeting obj1 = () ->{
			System.out.println("Good morning......");
		};
		obj1.greetME();
	}
}
