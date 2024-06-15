package com.techier;
/* * 01. Write a class with a default constructor, one argument constructor and two argument
 * constructors. Instantiate the class to call all the constructors of that class from
 * a main class
 */
class Emp1 {
	String name;
	String company;

	public Emp1() {
		super();
		System.out.println("Employee Details");
	}

	public Emp1(String name) {
		super();
		this.name = name;
	}

	public Emp1(String name, String company) {
		super();
		this.name = name;
		this.company = company;
	}

}

public class Employee {
	public static void main(String[] args) {
		Emp1 e = new Emp1();
		Emp1 e1 = new Emp1("sainath", "Google");
		Emp1 e2 = new Emp1("gowtham", "IBM");
		System.out.println(e.name + " " + e.company);
		System.out.println(e1.name + " " + e1.company);
		System.out.println(e2.name + " " + e2.company);

	}
}
