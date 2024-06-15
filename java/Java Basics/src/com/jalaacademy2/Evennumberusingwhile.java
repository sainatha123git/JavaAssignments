package com.jalaacademy2;

public class Evennumberusingwhile {
	public static void main(String[] args) {
		int i = 10;
		int n = 100;
		while (i <= n) {
			if (i % 2 == 0) {
				System.out.print(i + " ");
			}
			i++;
		}
	}
}
