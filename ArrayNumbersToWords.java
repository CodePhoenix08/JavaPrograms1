package com;

import java.util.Scanner;

public class ArrayNumbersToWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String arr[]= {"zero","one","two","three","four","five","six","seven","eight","nine"};
		Scanner ip=new Scanner(System.in);
		System.out.println("enter a number");
		int n=ip.nextInt();
		int rem=0;
		String s="";
		while(n!=0) {
			rem=n%10;
			s=arr[rem]+s; 
			n=n/10;
		}
		System.out.println(s);
	}

}
