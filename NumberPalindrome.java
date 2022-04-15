package com;

import java.util.Scanner;

public class NumberPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ip=new Scanner(System.in);
		System.out.println("enter a number : ");
		int n1=ip.nextInt();
		int n2=n1;
		int rem=0,res=0;
		while(n2!=0) {
			rem=n2%10;
			res=(res*10)+rem;
			n2=n2/10;
		} 
		if(res==n1) {
			System.out.println("its palindrome");
		}
		else {
			System.out.println("its not a palindrome");
		}

	}

}
