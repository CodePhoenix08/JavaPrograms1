package com;

public class ArrayMinEle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {12,3,4,55,88};
		int min=arr[0];
		for(int i=0;i<=arr.length-1;i++) {
			if(min>arr[i]) {
				min=arr[i];
			}
		}
		System.out.println("minimum element in array : "+min);
		}
}
