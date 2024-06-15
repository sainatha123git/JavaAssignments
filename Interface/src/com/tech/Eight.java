/*Create a PUBLIC interface with fields and methods, fields should have values assigned. 
Implement this interface to some class and print the values of the interface fields  and 
call the interface methods*/


package com.tech;
interface A {
	int x = 20;
	int y = 30;

	public void method1();

	public void method2();
}

public class Eight implements A {

	@Override
	public void method1() {
		// TODO Auto-generated method stub
		System.out.println("Method 1");
	}

	@Override
	public void method2() {
		// TODO Auto-generated method stub
		System.out.println("Method2 ");
	}


	public static void main(String[] args) {
		Eight p = new Eight();
		System.out.println(p.x);
		System.out.println(p.y);
		p.method1();
		p.method2();
	}
}







