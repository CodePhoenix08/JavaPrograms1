package com;

import java.util.Scanner;

public class StringPattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ip=new Scanner(System.in);
		System.out.println("enter a string");
		String s=ip.nextLine();
		System.out.println("enter a pattern");
		String p=ip.nextLine();
		int n= p.length();
		int c=0;
		for(int i=0;i<=s.length()-n;i++) {
			String s1="";
			for(int j=i;j<i+n;j++) {
				s1+=s.charAt(j);
			}
			if(s1.equals(p)) {
				c++;
			}
		}
		System.out.println(c);
	}

}
