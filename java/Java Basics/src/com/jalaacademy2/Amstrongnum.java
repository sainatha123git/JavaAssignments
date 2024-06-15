package com.jalaacademy2;

public class Amstrongnum {
	public static void main(String[] args) {
		int num = 153;
		int temp = num;
		int res = 0;
		while (num > 0) {
			int last = num % 10;
			res = res + (last * last * last);
			num = num / 10;
		}
		if (temp == res) {
			System.out.println("it's a Amstrong number");
		} else {
			System.out.println("it's not a Amstrong number ");
		}
	}
}