package com;

import java.util.regex.Pattern;

public class Regex2StartingWith {

	public static void main(String[] args) {
		//a string starting with A,a
		boolean b=Pattern.matches("[A,a].*", "apple");
		System.out.println(b);

	}

}
