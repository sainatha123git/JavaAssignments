package com.jalaacademy2;

public class Largestamongthreenums {
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		int c = 30;
		if ((a > b) && (a > c)) {
			System.out.println(a + "it's a biggest number");
		} else if ((b > c) && (c > a)) {
			System.out.println(b + "it's a biggest number");
		} else {
			System.out.println(c + "it's a biggest number");
		}
	}
}
