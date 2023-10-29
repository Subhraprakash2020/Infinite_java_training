package com.java.collection;

public class LambdaExp1 {
	public static void main(String[] args) {
		IHello obj1 = () ->{
			System.out.println("Hi am xxxxxxxxx");
		};
		obj1.show();
		
		IHello obj2 = () ->{
			System.out.println("Hi am yeyeyeyeye");
		};
		obj2.show();
	}
}
