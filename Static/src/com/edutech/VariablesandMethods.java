package com.edutech;

public class VariablesandMethods {
	static int x = 20;
	static int y = 30;
	int a = 40;
	int b = 50;

	public static void method1() {
		VariablesandMethods v = new VariablesandMethods();
		System.out.println(v.a + " " + v.b);
	}

	public static void method2() {
		System.out.println(VariablesandMethods.x + " " + VariablesandMethods.y);
		VariablesandMethods v1 = new VariablesandMethods();
		v1.method3();
		v1.method4();
	}

	public void method3() {
		VariablesandMethods v3 = new VariablesandMethods();
		v3.method1();
		v3.method1();
	}

	public void method4() {

	}

	public static void main(String[] args) {
		System.out.println(VariablesandMethods.x);
		System.out.println(VariablesandMethods.y);

		VariablesandMethods var = new VariablesandMethods();
		System.out.println(var.a);
		System.out.println(var.b);
		method1();
		method2();
		var.method3();
		var.method4();
	}

}
