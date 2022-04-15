package com;

import java.util.Scanner;

public class NoOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ip=new Scanner(System.in);
		System.out.println("enter a number : ");
		int n=ip.nextInt();
		int count=0;
		while(n!=0) {
			count++;
			n=n/10;
		}
		System.out.println("no of digits : "+count);

	}

}
