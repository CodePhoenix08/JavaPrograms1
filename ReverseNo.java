package com;

import java.util.Scanner;

public class ReverseNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ip=new Scanner(System.in);
		System.out.println("enter a number : ");
		int n=ip.nextInt();
		int rem=0,res=0;
		while(n!=0) {
			rem=n%10;
			res=(res*10)+rem;
			n=n/10;
		}
		System.out.println(res);

	}

}
