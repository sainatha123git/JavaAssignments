package com.edu;
//2. Create a class with DEFAULT fields and methods. Access these fields and methods 
//from any other class in the same package
public class Default {
	int x = 10;
	int y = 20;

	void method() {
		System.out.println("Java World");
	}

	public static void main(String[] args) {
		Default d1 = new Default();
		System.out.println(d1.x);
		System.out.println(d1.y);
		d1.method();
	}

}
