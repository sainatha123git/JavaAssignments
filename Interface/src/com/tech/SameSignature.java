package com.tech;
/*Create two interfaces with the same method (same signature) in both the interfaces. 
Implement these two interfaces in one class. Call the method.*/
interface offer {
	public void job();
}

interface onboard {
	public void job();
}

public class SameSignature implements offer, onboard {

	@Override
	public void job() {
		// TODO Auto-generated method stub
		System.out.println("Google offer");
	}

	public static void main(String[] args) {
		SameSignature s = new SameSignature();
		s.job();
	}
}
