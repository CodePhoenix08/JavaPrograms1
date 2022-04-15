package com;

import java.util.Scanner;

public class SumOfEvenDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ip=new Scanner(System.in);
		System.out.println("enter a number : ");
		int n=ip.nextInt();
		int sum=0,rem=0;
		while(n!=0) {
			rem=n%10;
			if(rem%2==0) {
			sum+=rem;}
			n=n/10;
		}
		System.out.println("sum of digits : "+sum);

	}

}
