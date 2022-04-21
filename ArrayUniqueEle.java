package com;

public class ArrayUniqueEle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,1,3,2,4,5};
		
		for(int i=0;i<=arr.length-1;i++) {
			int flag=0;
			for(int j=0;j<=arr.length-1;j++) {
				if(i!=j && arr[i]==arr[j]) {
					flag=1;
				}
			}
			if(flag==0) {
				System.out.println(arr[i]);
			}
		}

	}

}
