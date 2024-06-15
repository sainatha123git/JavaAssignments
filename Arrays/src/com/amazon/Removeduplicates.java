package com.amazon;

public class Removeduplicates {
	public static void main(String[] args) {
		int[] arr = { 2, 2, 3, 3, 4, 4, 5, 5, 6, 6 };

		for (int i = 0; i <= arr.length - 1; i++) {
			System.out.print(arr[i] + " ");
		}
		removeDuplicates(arr);
		System.out.println();
		for (int i = 0; i <= arr.length - 1; i++) {
			System.out.print(arr[i] + " ");

		}
	}

	public static void removeDuplicates(int[] arr) {
		int rd = 0;
		for (int i = 1; i <= arr.length - 1; i++) {
			if (arr[rd] != arr[i]) {
				rd++;
				arr[rd] = arr[i];
			}
		}
	}
}
