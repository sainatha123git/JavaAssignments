package com.org.load;

public class MethodOverloading {
	public static void main(String[] args) {
		A a = new A();
		System.out.println(a.m1(10, 20));
		System.out.println(a.m1(20, 30));
		a.m3(80, 'a');
		a.m4("sainath", 25.5f, 21);
		System.out.println(a.m5(10, 20, 30));
		System.out.println(a.m6(50, 60, 70));
		a.m7(100, 'b');
		a.m8(30.2f, 40.00, 321);
		System.out.println(a.m9("sainath", "gowtham"));
		System.out.println(a.m10("IBm", "Capgemini"));
	}
}

class A {
	public int m1(int x, int y) {
		return x + y;
	}

	public int m1(int a, int b, int c) {
		return a + b + c;
	}

	public void m3(int x, char c) {
		System.out.println("Hello Jala Academy");
	}

	public void m4(String name, float salary, int age) {
		System.out.println(name + " " + salary + " " + age);
	}

	public int m5(int x, int y, int z) {
		return x + y + z;
	}

	public int m6(int p, int q, int r) {
		return p * q * r;
	}

	public void m7(int d, char ch) {
		System.out.println(d + "" + ch);
	}

	public void m8(float f, double db, int x) {
		System.out.println("Hello method overloading ");
	}

	public String m9(String str, String s) {
		return "str";
	}

	public String m10(String str, String s) {
		return s;
	}

}