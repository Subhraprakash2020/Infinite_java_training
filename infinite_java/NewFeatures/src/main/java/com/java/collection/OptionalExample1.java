package com.java.collection;

import java.util.Optional;

public class OptionalExample1 {
	public static void main(String[] args) {
		String[] str = new String[10];
		str[0] = "Rahul";
		str[1] = "Sourabh";
		str[2] = "Satya";
		
		Optional<String> result = Optional.ofNullable(str[8]);
		if(result.isPresent()) {
			System.out.println(str[8]);
		}
		else {
			System.out.println("Value is not availabble in the index");
		}
	}
}
