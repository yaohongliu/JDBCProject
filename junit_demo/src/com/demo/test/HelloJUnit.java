package com.demo.test;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class HelloJUnit {
	
	@BeforeAll
	public static void HelloBeforeAll() {
		// TODO Auto-generated method stub
		System.out.println("Hello from helloBeforeAll()");
	}
	@BeforeEach
	public void HelloBeforeEach() {
		// TODO Auto-generated method stub
		System.out.println("Hello from helloBeforeEach()");
	}
	@Test
	public void testHello1() {
		// TODO Auto-generated method stub
		System.out.println("Hello from testHello1()");
	}
	@Test
	public void testHello2() {
		// TODO Auto-generated method stub
		System.out.println("Hello from testHello2()");
	}
	@AfterEach
	public void HelloAfterEach() {
		// TODO Auto-generated method stub
		System.out.println("Hello from helloAfterEach(). this will be executed after every test case within this class");
	}
	@AfterAll
	public static void HelloAfterAll(){
		// TODO Auto-generated method stub
		System.out.println("Hello from helloAfterAll()");
	}

}
