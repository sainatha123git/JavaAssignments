package com.amazon;

public class Averageofanarray {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
		System.out.println(avgofArray(arr));
	}

	public static double avgofArray(int[] arr) {
		int total = 0;
		for (int i = 0; i <= arr.length - 1; i++) {
			total += arr[i];
		}
		return (double) total / arr.length;
	}
}