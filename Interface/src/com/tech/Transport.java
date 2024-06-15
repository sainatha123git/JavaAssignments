package com.tech;

public class Transport implements Bus {

	@Override
	public void passengers() {
		// TODO Auto-generated method stub
		System.out.println("Huge Passengers ");
	}
       public static void main(String[] args) {
		  Transport t = new Transport();
		  t.passengers();
	}
}
