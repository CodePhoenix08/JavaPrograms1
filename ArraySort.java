package com;

public class ArraySort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {12,55,33,44,200,99,900,500};
		for(int i=0;i<=arr.length-1;i++) {
			for(int j=i+1;j<=arr.length-1;j++) {
				if(arr[i]>arr[j]) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		for(int i:arr) {
			System.out.print(i+" ");
		}
		System.out.println();
		System.out.println("third minimum ele "+arr[3-1]);
		System.out.println("third maximum ele "+arr[arr.length-3]);
	}

}
