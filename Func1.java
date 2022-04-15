package com;

import java.util.Scanner;

public class Func1 {
	
	static int add(int n1,int n2) {
		// write your code here
		return n1+n2;
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ip=new Scanner(System.in);
		System.out.println("please enter two numbers :");
		int n1=ip.nextInt();
		int n2=ip.nextInt();
		System.out.println(add(n1,n2));
	}

}
