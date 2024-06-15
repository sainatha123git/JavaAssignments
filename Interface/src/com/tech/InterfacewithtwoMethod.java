package com.tech;

interface m1 {
	public void m1();
	public void m2();
}

public class InterfacewithtwoMethod implements m1{

	@Override
	public void m2() {
		// TODO Auto-generated method stub
		System.out.println("Method1");
	}

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		System.out.println("method2");
	}

	public static void main(String[] args) {
		InterfacewithtwoMethod t = new InterfacewithtwoMethod();
		t.m1();
		t.m2();
	}
}
