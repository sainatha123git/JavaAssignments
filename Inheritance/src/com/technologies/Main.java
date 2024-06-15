package com.technologies;

public class Main {
	public static void main(String[] args) {
		A a = new A();
		B b = new B();
		C c = new C();
	
		a.m1();
		a.m2();
		a.overridden();

		b.m3();
		b.m4();
		b.overridden();

		c.m5();
		c.m6();
		c.overridden();

	}
}
