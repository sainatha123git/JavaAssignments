package com.jala.javaIo;

import java.io.Closeable;

//5.Write a program to read text from .txt file using FileReader

public class FileReader {

	public static void main(String[] args) {

		try {

			FileReader fr = new FileReader();

			int i;

			while ((i = fr.read()) != -1) {

				System.out.print((char) i);
			}

			((Closeable) fr).close();

		} catch (Exception e) {

			e.printStackTrace();
		}
	}

	private int read() {

		return 0;
	}
}
