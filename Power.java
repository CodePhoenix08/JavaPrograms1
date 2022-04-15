package com;

import java.util.Scanner;

public class Power {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ip=new Scanner(System.in);
		System.out.println("enter a base number");
		int base=ip.nextInt();
		System.out.println("enter a power number");
		int p=ip.nextInt();
		int power=1;
		for(int i=1;i<=p;i++) {
			power=power*base;
			
		}
		System.out.println("for loop : "+power);
		System.out.println("predefined "+Math.pow(base, p));	
		
		
	}

}
