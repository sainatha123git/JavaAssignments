package com.amazon;

public class MaxandMinofanarray {

	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4, 5 };
		int[] minMax = findMinMax(array);
		System.out.println("Min: " + minMax[0] + ", Max: " + minMax[1]); 
	}

	public static int[] findMinMax(int[] arr) {
		int max = arr[0];
		int min =arr[0];
		for(int i=0;i<=arr.length-1;i++)
		{
			if(arr[i]<max)
			{
			      max = arr[i];
			}
			else if(arr[i]>min)
			{
		         min = arr[i];
			}
			
		}
		 return  new int[]{max,min}; 
	}
}
			