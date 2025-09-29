package com.vkakarla.imp;

import java.util.Arrays;

// a Java program to check if two strings are anagrams, and if they are, print "Anagrams".
// I’ll give you the best solution (clean, efficient, works for Unicode, and ignores case & spaces if needed).

public class P1 {

	public static void main(String[] args) {

		String str1 = "Listen";
		String str2 = "Silent";

		str1 = str1.replaceAll("\\S", "").toLowerCase();
		str2 = str2.replaceAll("\\S", "").toLowerCase();

		char[] a1 = str1.toCharArray();
		char[] a2 = str2.toCharArray();

		Arrays.sort(a1);
		Arrays.sort(a2);

		if (Arrays.equals(a1, a2)) {
			System.out.println("Anagrams");
		} else {
			System.out.println("Not Anagrams");
		}

	}

}
