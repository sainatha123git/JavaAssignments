package com.exceptions;

public class ArrayIndexOutOfBound {

/* * 9. Write a program to generate ArrayIndexOutOfBoundException
*/
	    public static void main(String[] args) {
	       
	        String[] arr = {"Sharan", "Rahul", "Leo", "Arun"};
	   
	        try {
	            System.out.println(arr[5]);
	        }
	        catch (ArrayIndexOutOfBoundsException e){
	            System.err.println("ArrayIndexOutOfBoundsException caught");
	          
	            e.printStackTrace();
	        }
	    }
	}
