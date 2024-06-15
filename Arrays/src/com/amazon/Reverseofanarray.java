package com.amazon;

public class Reverseofanarray {
	public static void main(String[] args) {
		int[] arr = { 2, 4, 6, 8, 10 };
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		reverse(arr);
		System.out.println();

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public static void reverse(int[] arr) {
		int i = 0;
		int j = arr.length - 1;
		while (i < j) {
			int t = arr[i];
			arr[i] = arr[j];
			arr[j] = t;
			i++;
			j--;
		}
	}
}
