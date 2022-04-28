package com;

import java.util.regex.Pattern;

public class Regex5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean b=Pattern.matches(".[Z,z].*","aZ123");
		System.out.println(b);

	}

}
