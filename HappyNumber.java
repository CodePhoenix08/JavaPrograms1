package com;

import java.util.Scanner;

public class HappyNumber {
	
	static int happyNumber(int n1) {
		int rem=0,sum=0;
		while(n1!=0) {
			rem=n1%10;
			sum=sum+(rem*rem);
			n1=n1/10;
		}
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ip=new Scanner(System.in);
		System.out.println("enter a number : ");
		int n1=ip.nextInt();
		while(n1!=1 && n1!=4) {
			n1=happyNumber(n1);
		}
		if(n1==1) {
			System.out.println("happy number");
		}
		else {
			System.out.println("not a happy number");
		}

	}

}
