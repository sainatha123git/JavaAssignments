package com.amazon;

import java.util.Arrays;

public class Positionofanarray {

	public static void main(String[] args) {
		int[] originalArray = { 1, 2, 3, 4, 5 };
		int[] modifiedArray = insertElement(originalArray, 10, 2);
		System.out.println(Arrays.toString(modifiedArray)); 
	}

	public static int[] insertElement(int[] arr, int element, int position) {
		int[] newArray = new int[arr.length + 1];
		for (int i = 0, j = 0; i < newArray.length; i++) {
			if (i == position) {
				newArray[i] = element;
			} else {
				newArray[i] = arr[j++];
			}
		}
		return newArray;
	}
}
