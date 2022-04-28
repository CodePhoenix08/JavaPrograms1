package com;

import java.util.regex.Pattern;

public class Regex6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String gmail="abcd@gmail.com";
		boolean b=Pattern.matches("[a-z,A-Z]{4}@gmail.com",gmail);
		System.out.println(b);
	}

}
