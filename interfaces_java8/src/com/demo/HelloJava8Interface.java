package com.demo;

public interface HelloJava8Interface {

	public static void hiStatic() {
		System.out.println("Hello from static method");
	}
	
	default void hiDefault() {
		System.out.println("Hi from default method from Java");
	}
}
