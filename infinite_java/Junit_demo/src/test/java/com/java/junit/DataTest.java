package com.java.junit;

import static org.junit.Assert.assertEquals;

public class DataTest {
	public void testSayHello() {
		Data obj = new Data();
		assertEquals("Welcome to Junit programming...", obj.sayHello());
 	}
}
