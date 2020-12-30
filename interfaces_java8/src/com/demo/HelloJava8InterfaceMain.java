package com.demo;

public class HelloJava8InterfaceMain implements HelloJava8Interface{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println("Hello from HelloJava8InterfaceMain");
		HelloJava8Interface.hiStatic();//static so you can access directly
		HelloJava8InterfaceMain hm = new HelloJava8InterfaceMain();
		hm.hiDefault();
	}

}
