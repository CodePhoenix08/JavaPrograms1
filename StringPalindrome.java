package com;

import java.util.Scanner;

public class StringPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ip=new Scanner(System.in);
		System.out.println("enter a string :");
		String s1=ip.nextLine();
		System.out.println("========================");
		System.out.println("String in reverse order");
		String s2="";
		for(int i=s1.length()-1;i>=0;i--) {
			s2=s2+s1.charAt(i);
		}
		System.out.println(s2);
		System.out.println("=======================");
		System.out.println("to check palindrome");
		if(s1.equals(s2)) {
			System.out.println("its palindrome");
		}
		else {
			System.out.println("its not a palindrome");
		}
		

	}

}
