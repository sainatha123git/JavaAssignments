package com.academy;

public class WatstocreateString {
	public static void main(String[] args) {

		// Ways to create a String
		String str = "Hello Strings";
		System.out.println(str);
		String s = new String("Hello java world");
		System.out.println(s);
		// Concatenating two strings using + operator
		String s1 = "jala";
		String s2 = "academy";
		System.out.println(s1 + " " + s2);
		// Finding the length of the string
		String name = "sainatha";
		System.out.println(name.length());
		// Extract a string using Substring
		String sb = "Hello Strings";
		String st = sb.substring(1, 5);
		System.out.println(st);
		// Searching in strings using indexOf()
		String si = "Searching index";
		int i1 = si.indexOf("index");
		int i2 = si.indexOf("r", 3);
		System.out.println("index value1 : " + i1);
		System.out.println("index value2 : " + i2);
		// Matching a String Against a Regular Expression With matches()
		String ms = "Matching a String";
		boolean match = ms.matches("(.*)String(.*)");
		System.out.println("Matches : " + match);
		// Comparing strings using the methods equals(),
		String s5 = "JalaAcademy";
		String s6 = "JalaAcademy";
		System.out.println(s5.equals(s6));
		// equalsIgnoreCase(), startsWith(), endsWith() and compareTo()
		String sr = "JavaDeveloper";
		String sr1 = "JavaDeveloper";
		boolean b = sr.equalsIgnoreCase(sr1);
		System.out.println(b);
		boolean b1 = sr.startsWith("Java");
		System.out.println(b1);
		boolean b2 = sr.endsWith("Developer");
		System.out.println(b2);
		int c = s5.compareTo(s6);
		System.out.println(c);
		// Trimming strings with trim()
		String sg = "Jala Academy";
		String sn = sg.trim();
		System.out.println(sn);
		// 10. Replacing characters in strings with replace()
		String stn = "Jala Academy";
		String sg1 = stn.replaceAll("a", "t");
		System.out.println(sg1);
		// 11. Splitting strings with split()
		String ss = "James Goslling";
		String[] sn1 = ss.split(" ");
		for (String var : sn1) {
			System.out.println(var);
		}
		// 12. Converting Numbers to Strings with valueOf()
		int si1 = 12;
		String gns = String.valueOf(si1);
		System.out.println(gns);
		// 13. Converting integer objects to Strings
		int is = 11;
		// Integer.toString() method converts int to str
		String iTs = Integer.toString(is);
		System.out.println("Converted int to str : " + iTs + 33);

// 14. Converting to uppercase and lowercase
		String an = "upper case";
		String bn = "LOWER CASE";
		// toUpperCase() method converts lower to upper case
		String cn = an.toUpperCase();
		// toLowerCase() method converts upper to lower case
		String d = bn.toLowerCase();
		System.out.println("Converted to upper case : " + c);
		System.out.println("Converted yo lower case : " + d);

	}
}
