package com.jalaacademy2;

public class PrintGender {
	public static void main(String[] args) {
		String gender = "male";
		switch (gender) {
		case "male":
			System.out.println(gender + ": it's male gender ");
			break;
		case "female":
			System.out.println(gender + "it's a female gender ");
			break;
		default:
			System.out.println("invalid input");
			break;
		}
	}
}