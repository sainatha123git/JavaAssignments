package com.exceptions;


	// 17. Write a program to generate StringIndexOutOfBoundsException
	
	public class StringIndexOutOfBounds {
	    public static void main(String[] args) {

	        String str = "Sharan";
	        try {
	       
	            char charAtNegativeIndex = str.charAt(-1);
	          
	            char charAtLengthIndex = str.charAt(11);
	        } catch (StringIndexOutOfBoundsException e) {
	            System.err.println("StringIndexOutOfBoundsException caught");
	         
	            e.printStackTrace();
	        }
	    }
	}

