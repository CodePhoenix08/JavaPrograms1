package com;

import java.util.Scanner;

public class ForInputDemo {

	public static void main(String[] args) {
	Scanner ip=new Scanner(System.in);
	int sum=0;
	System.out.println("enter 10 integers");
	for(int i=0;i<10;i++) {
		int n=ip.nextInt();
		sum+=n; //sum=sum+n
	}
	System.out.println("sum is : "+sum);
	System.out.println("avg is : "+(sum/10));
	}

}
