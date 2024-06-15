package com.jala;

public class Functiontocallname {
	public static void main(String[] args) {
		Name n1 = new Name();
		String name = n1.name();
		System.out.println(name);
	}
}

class Name {
	public String name() {
		return "sainatha";
	}
}
