package com.tech;

interface a {
	public void a1();
}

interface b extends a {
	public void b1();
}

public class Inherit implements a, b {

	@Override
	public void b1() {
		// TODO Auto-generated method stub
		System.out.println("b1 method");
	}

	@Override
	public void a1() {
		// TODO Auto-generated method stub
		System.out.println("b2 method ");
	}

}
