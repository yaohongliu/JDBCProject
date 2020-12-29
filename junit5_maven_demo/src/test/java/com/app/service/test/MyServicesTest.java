package com.app.service.test;

import com.app.service.MyServices;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class MyServicesTest {
private static MyServices services;
	
	@BeforeAll
	public static void setupMyServices() {
		services=new MyServices();
	}
	
	@Test
	public void testSayHelloByName() {
		String output="Hello Melody";
		assertEquals(output, services.sayHello("Melody"));
	}
	
	@Test
	public void testSayHelloForNull() {
		
		assertNull(services.sayHello(null));
	}
}
