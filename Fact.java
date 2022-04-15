package com;

import java.util.Scanner;

public class Fact {

	public static void main(String[] args) {
		Scanner ip=new Scanner(System.in);
		System.out.println("please enter the number to find fact");
		int n=ip.nextInt();
		long fact=1;
		if(n<0) {
			System.out.println("idiot get out");
			
		}
		else {
			for(int i=1;i<=n;i++) {
				fact=fact*i;
			}
			System.out.println("fact ans is : "+fact);
		}
		

	}

}
