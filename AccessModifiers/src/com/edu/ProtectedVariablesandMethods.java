package com.edu;

public class ProtectedVariablesandMethods {
	public static void main(String[] args) {
		child c = new child();
		System.out.println(c.x);
		System.out.println(c.name);
		c.name();
	}
}

class child extends ProtectedVariablesandMethods {
	protected int x = 20;
	protected String name = "jala academy";

	protected void name() {

		System.out.println("Java world ");
	}
}
