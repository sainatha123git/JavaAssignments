package com.exceptions;
/* 1. Write a program to generate Arithmetic Exception without exception handling
 * 2. Handle the Arithmetic exception using try-catch block*/
public class ArithematicExceptions {
public static void main(String[] args) {
	int a =10 ,b = 0, c;
	  
	try
	  {
		System.out.println("Inside the block ");
		  c =a/b;
		  System.out.println(c);
	  }
	catch (java.lang.ArithmeticException e) {
		System.out.println("Handling Arihematic exception using  catch block");
	}
	c =a/b;
	System.out.println("Exception without Handling");
}
}
