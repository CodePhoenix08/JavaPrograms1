package com;

import java.util.regex.Pattern;

public class Regex7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="abcd1234_@hackkerank.com";
		boolean b=Pattern.matches("[A-Z,a-z]{4,6}[0-9]{4,6}_*@hackkerank[.]com",s);
		System.out.println(b);
	}

}
