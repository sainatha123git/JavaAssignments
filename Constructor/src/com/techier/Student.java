package com.techier;

/* 02. Call the constructors(both default and argument constructors) of super class from a child
	 * class
	 */
public class Student {
	public static void main(String[] args) {
		ChildClass c = new ChildClass();
		ChildClass c1 = new ChildClass(1014);
		ChildClass c2 = new ChildClass("sainath", "civil", "gitam", "hyd");

	}

}

class ChildClass extends Student {

	String clg;
	String city;

	ChildClass() {
		super();
	}

	ChildClass(int rollNo) {
		super();
	}

	ChildClass(String name, String branch, String clg, String city) {
		super();
		this.clg = clg;
		this.city = city;
		System.out.println("College : " + this.clg);
	}
}
