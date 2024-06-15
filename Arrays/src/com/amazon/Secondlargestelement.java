package com.amazon;

public class Secondlargestelement {
	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 40, 50, 60 };
		int secondlargest = secondLargestelement(arr);
		System.out.println(secondlargest);
	}

	public static int secondLargestelement(int[] arr) {
		int max1 = 0;
		int max2 = 0;
		if (arr[0] > arr[1]) {
			max1 = arr[0];
			max2 = arr[1];

		} else {
			max2 = arr[1];
			max1 = arr[0];
		}
		for (int i = 2; i <= arr.length - 1; i++) {
			if (arr[i] > max1) {
				max2 = max1;
				max1 = arr[i];

			} else if (arr[i] > max2) {
				max2 = arr[i];
			}
		}
		return max2;
	}

}
