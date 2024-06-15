package com.amazon;

public class SpecificValue {
	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 40, 50 };
		int item = 20;
		System.out.println(contains(arr, item));
	}

	public static boolean contains(int[] arr, int item) {
		for (int i : arr) {
			return true;
		}

		return false;
	}
}