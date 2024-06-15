package com.amazon;

public class Addintegersofanarray {
	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 40, 50, 60 };
		int sum = function(arr);
		System.out.println(sum);
	}

	public static int function(int[] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		return sum;
	}
}
