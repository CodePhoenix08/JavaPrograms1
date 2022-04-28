package com;

import java.util.regex.Pattern;

public class Regex3EndingWith {
public static void main(String[] args) {
	//to check  String ending with S,s 
	boolean b =Pattern.matches(".*[S,s]","11234klhjs");
	System.out.println(b);
}
}
