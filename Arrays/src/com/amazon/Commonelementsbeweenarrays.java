package com.amazon;

import java.util.ArrayList;
import java.util.List;

public class Commonelementsbeweenarrays {
	public static void main(String[] args) {
		int[] arr1 = { 1, 2, 3, 4, 5 };
		int[] arr2 = { 6, 7, 4, 5, 9 };

		List<Integer> commonelements = new ArrayList<>();
		for (int i = 0; i <= arr1.length - 1; i++) {
			for (int j = 0; j <= arr2.length - 1; j++) {
				if (arr1[i] == arr2[j]) {
					commonelements.add(arr1[i]);
					break;
				}

			}

		}
		System.out.println(commonelements);
	}
}