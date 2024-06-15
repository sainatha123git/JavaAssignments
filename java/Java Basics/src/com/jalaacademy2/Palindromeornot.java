package com.jalaacademy2;

public class Palindromeornot {
	public static void main(String[] args) {

		int num = 151;
		int temp = num;
		int rev = 0;
		while (num > 0) {
			int last = num % 10;
			rev = (rev * 10) + last;
			num = num / 10;
		}
		System.out.println("orginal number :" + temp);
		System.out.println("palindrome number :" + rev);
		if (temp == rev) {
			System.out.println(temp + "it's a palindrome number ");
		} else {
			System.out.println(temp + "it's not a palindrome number ");
		}
	}
}
