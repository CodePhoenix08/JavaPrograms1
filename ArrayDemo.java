package com;
import java.util.Scanner;
public class ArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner ip=new Scanner(System.in);
		System.out.println("enter a size of array");
		int size=ip.nextInt();
		int[] arr=new int[size];
		System.out.println("enter a values for a array");
		for(int j=0;j<=size-1;j++) {
			int ele=ip.nextInt();
			arr[j]=ele;
		}
		System.out.println("array elements are");
		for(int i=0;i<= arr.length-1;i++) {
			System.out.println(arr[i]);
		}
		
		
		
	}

}
