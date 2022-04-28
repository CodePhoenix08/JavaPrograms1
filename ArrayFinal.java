package com;

import java.util.Scanner;

public class ArrayFinal {
	static boolean primeno(int n) {
		if(n==0||n==1) {
			return false;
		}
		else if(n==2) {
			return true;
		}
		else {
			int flag=0;
			for(int i=2;i<n/2;i++) {
				if(n%i==0) {
					flag=1;
					break;
				}
			}
			if(flag==0) {
				return true;
			}
			else {
				return false;
			}
	}}

	public static void main(String[] args) {
		Scanner ip=new Scanner(System.in);
		System.out.println("enter a size of array : ");
		int size =ip.nextInt();
		int arr1[]=new int[size];
		System.out.println("enter the elements: ");
		for(int i=0;i<=size-1;i++) {
			int n=ip.nextInt();
			boolean ans=primeno(n);
			arr1[i]=ans?n*100:n%2==0?n*20:n*10;
		}
		int sum=0;
		for(int i:arr1) {
			sum+=i;
		}
		System.out.println(sum);
			
		
		

	}

}
