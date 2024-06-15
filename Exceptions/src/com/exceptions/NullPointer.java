package com.exceptions;

	
	public class NullPointer {
	  
	    static void simpleNullCheck(String str) {
	        System.out.println(str.length());
	    }

	    public static void main(String args[]) {

	        String input = null;
	        try {
	            simpleNullCheck(input);
	        } catch (NullPointerException e) {
	          
	            e.printStackTrace();
	        }
	    }
	}
