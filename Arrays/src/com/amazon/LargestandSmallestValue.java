package com.amazon;

public class LargestandSmallestValue {
	public static void main(String[] args) {
		int[] arr = { 2, 4, 6, 8, 9 };
		;
		int diff = findDifference(arr);
		System.out.println(diff);
	}

	public static int findDifference(int[] nums) {
		int min = nums[0];
		int max = nums[0];

		for (int i = 1; i < nums.length; i++) {
			if (nums[i] < min) {
				min = nums[i];
			}
			if (nums[i] > max) {
				max = nums[i];
			}
		}

		return max - min;
	}
}