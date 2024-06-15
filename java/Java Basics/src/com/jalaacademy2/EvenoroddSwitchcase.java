package com.jalaacademy2;

public class EvenoroddSwitchcase {
	public static void main(String[] args) {
		int num = 12;

		switch (num%2) {
		case 1:
			System.out.println(num + ": it's a even number ");

			break;
		case 2:
			System.out.println(num + " :it's a odd number ");
			break;
		default:
			System.out.println("Invalid output");

		}
	}
}
