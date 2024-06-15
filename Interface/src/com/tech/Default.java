package com.tech;
/*6. Create an interface with a default method and implement it in a class. Do not provide 
implementation to the default method and call the method.*/

interface i1 {
	default void car() {
		System.out.println("Benz");
	}
}

public class Default implements i1 {
	public static void main(String[] args) {
		Default d1 = new Default();
		d1.car();
	}
}
