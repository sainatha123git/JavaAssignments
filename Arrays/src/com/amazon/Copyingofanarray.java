package com.amazon;

import java.util.Arrays;

public class Copyingofanarray {
	public static void main(String[] args) {
		int[] originalArray = { 1, 2, 3, 4, 5 };
		int[] copiedArray = copyArray(originalArray);
		System.out.println(Arrays.toString(copiedArray)); 
	}

	public static int[] copyArray(int[] arr) {
		int[] copiedArray = new int[arr.length];
		System.arraycopy(arr, 0, copiedArray, 0, arr.length);
		return copiedArray;
	}
}
