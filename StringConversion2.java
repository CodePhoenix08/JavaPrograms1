package com;

import java.util.Scanner;

public class StringConversion2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ip=new Scanner(System.in);
		System.out.println("enter the String : ");
		String s1=ip.nextLine();
		String s2="";
		for(int i=0;i<=s1.length()-1;i++) {
			
			if(s1.charAt(i)>='a' && s1.charAt(i)<='z') {
				s2=s2+ (char)(s1.charAt(i)-32);
			}
			else if(s1.charAt(i)>='A' && s1.charAt(i)<='Z') {
				s2=s2+ (char)(s1.charAt(i)+32);
			}
			else {
				s2=s2+s1.charAt(i);
			}
			
		}
		System.out.println(s2);
		
		
	}

}
