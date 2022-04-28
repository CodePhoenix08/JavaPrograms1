package com;
import java.util.regex.*;
public class Regex1 {

	public static void main(String[] args) {
		String name="madhu";
		Pattern p=Pattern.compile("[a-z]{5,8}");
		Matcher m=p.matcher(name);
		boolean b=m.matches();
		System.out.println(b);
		System.out.println(Pattern.matches("[a-z]{5,9}", name));

	}

}
