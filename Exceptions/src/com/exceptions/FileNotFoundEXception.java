package com.exceptions;
//11.Write a program to generate FileNotFoundException
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

//6. Write a program to create your own exception
public class FileNotFoundEXception {
	public class FileNotFound {
	    public static void main(String[] args) {

	        try {
	          
	            BufferedReader reader = new BufferedReader(new FileReader(new File("/invalid/file/location")));
	        }
	        
	        catch (FileNotFoundException e) {
	            System.err.println("FileNotFoundException caught!");
	           
	            e.printStackTrace();
	        }
	    }
	}
}
