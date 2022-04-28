package com;

import java.util.Scanner;

public class ArrayDynamicInputs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ip=new Scanner(System.in);
		System.out.println("enter the size of array : ");
		int size =ip.nextInt();
		System.out.println("enter the elements :");
		int arr1[]=new int[size];
		for(int i=0;i<=size-1;i++) {
			arr1[i]=ip.nextInt();
		}
		System.out.println("array elements are :");
		for(int ele:arr1) {
			System.out.print(ele+" ");
		}
		
	}

}
