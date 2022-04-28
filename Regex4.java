package com;

import java.util.regex.Pattern;

public class Regex4 {

	public static void main(String[] args) {
		boolean b=Pattern.matches(".*hi.*","bye");
		System.out.println(b);

	}

}
