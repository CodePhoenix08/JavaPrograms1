package com;

public class ArrayWithReverseOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[]= {1,2,3,4,5,6,7,8};
		int arr2[]=new int[arr1.length];
		for(int i=0,j=arr1.length-1;i<=arr1.length-1;i++,j--) {
			arr2[i]=arr1[j];
		}
		for(int i:arr2) {
			System.out.print(i+" ");
		}
	}

}
