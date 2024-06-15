package com.amazon;

public class Indexofanarray {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
		int ele = 3;
		int index = findIndex(arr, ele);
		System.out.println(index);
	}

	public static int findIndex(int[] arr, int ele) {
		for (int i = 0; i <= arr.length - 1; i++) {
			if (ele == arr[i]) {
				return i;
			}
		}
		return -1;
	}
}