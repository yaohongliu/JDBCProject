package com.demo.service.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.demo.service.MyServices;


public class MyServicesTest {

	private static MyServices services;
	
	@BeforeAll
	public static void setUpMyServices() {
		services = new MyServices();
		//System.out.println("hello from helloBeforeClass");
	}
	
	@Test
	public void testHelloByName() {
		String output = "Hello Melody";
		//System.out.println("hello before helloBeforeClass");
		assertEquals(output, services.sayHello("Melody"));
	}
	
	@Test
	public void testHelloForNull() {
		String output = "Hello ";
		//System.out.println("hello before helloBeforeClass");
		assertNull(output, services.sayHello(null));
	}
}
