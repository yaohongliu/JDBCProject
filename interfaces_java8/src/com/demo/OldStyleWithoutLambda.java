package com.demo;

import lambda_demo.HelloFunctional;

public class OldStyleWithoutLambda implements HelloFunctional{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HelloFunctional h = new OldStyleWithoutLambda();
		h.hello();
		
		HelloFunctional h1 = new HelloFunctional() {
			@Override
			public void hello() {
				System.out.println("Hello old style inner");
		}
		};
		h1.hello();
		
		HelloFunctional h2 = new HelloFunctional() {
			@Override
			public void hello() {
				System.out.println("Hello again old inner");
			}
		};
		h2.hello();
	}
	@Override
	public void hello() {
		System.out.println("Hello old style");
	}
}
