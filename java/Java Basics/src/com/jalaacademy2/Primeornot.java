package com.jalaacademy2;

public class Primeornot {
	public static void main(String[] args) {
		int num = 13;
		boolean isPrime = true;
		for (int i = 2; i < num; i++) {
			if (i % num == 0) {
				isPrime = false;
				break;
			}
		}
		if (isPrime) {
			System.out.println("it's a prime number");
		} else {
			System.out.println("it's not a prime number ");
		}
	}
}
