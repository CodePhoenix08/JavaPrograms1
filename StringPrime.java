package com;

import java.util.Scanner;

public class StringPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ip =new Scanner(System.in);
		System.out.println("enter a string");
		String s=ip.nextLine();
		int l=s.length();
		int flag=0;
		if(l==1 || l==0) {
			System.out.println("invalid ");
		}
		else {
			for(int i=2;i<=l/2;i++) {
				if(l%i==0) {
					flag=1;
				}
			}
		}
		if (flag==0) {
			System.out.println("invalid String ");
		}
		else {
			String s1="";
			for(int i=1;i<=l;i++) {
				if(l%i==0) {
					s1+=s.charAt(i-1);
				}
			}
			System.out.println(s1);
		}
		
	}

}
