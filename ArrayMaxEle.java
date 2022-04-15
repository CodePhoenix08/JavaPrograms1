package com;

public class ArrayMaxEle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr= {11,22,44,33,200,40};
		int max=0;
		for(int i=0;i<=arr.length-1;i++) {
			if(max<arr[i]) {
				max=arr[i];	
			}
		}
		System.out.println("maximum ele in array: "+max);
	}

}
