package com.amazon;

public class Evenoddinanarray {
	public static void main(String[] args) {
		int[] arr = { 2, 4, 6, 8, 7, 9 };
		int evenodd = evenOdd(arr);
		System.out.println(evenodd);

	}

	public static int evenOdd(int[] arr) {
		int even = 0;
		int odd = 0;

		for (int i = 0; i <= arr.length - 1; i++) {
			if (arr[i] % 2 == 0) {
				even++;
			} else {
				odd++;
			}
		}
		return even;
	}
}
