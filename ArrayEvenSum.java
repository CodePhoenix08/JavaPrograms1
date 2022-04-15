package com;

import java.util.Scanner;

public class ArrayEvenSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]=new int[10];
		Scanner ip=new Scanner(System.in);
		System.out.println("enter a 10 elements of array");
		for(int i=0;i<=arr.length-1;i++) {
			arr[i]=ip.nextInt();
		}
		int sum=0;
		for(int j=0;j<=arr.length-1;j++) {
			if(arr[j]%2==0) {
				sum+=arr[j];
			}
		}
		System.out.println("sum of even number is : "+sum);
	}

}
