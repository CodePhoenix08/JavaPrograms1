package com;

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		Scanner ip=new Scanner(System.in);
		System.out.println("enter a number ");
		int n1=ip.nextInt();
		int n2=n1,n3=n1;
		int count=0;
		while(n2!=0) {
			count++;
			n2=n2/10;
		}
		int sum=0,rem=0;
		while(n3!=0) {
			rem=n3%10;
			int power=1;
			for(int i=1;i<=count;i++) {
				power*=rem;
			}
			sum+=power;
			n3=n3/10;
		}
		if(sum==n1) {
			System.out.println("armstrong number");
		}
		else {
			System.out.println("not a armstrong number");
		}
	}

}
