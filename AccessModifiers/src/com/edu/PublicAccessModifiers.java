package com.edu;

public class PublicAccessModifiers {
	public String name = "Hello Developers ";
	public int x = 25;

	public void method() {
		System.out.println("Hello spring developers");
	}

	public static void main(String[] args) {
		PublicAccessModifiers p = new PublicAccessModifiers();
		System.out.println(p.name);
		System.out.println(p.x);
		p.method();
	}
}
