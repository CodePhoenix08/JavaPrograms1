package com;

public class ArrayIdentical {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[]= {1,2,3,4,5};
		int arr2[]= {1,2,4,4,5};
		if(arr1.length==arr2.length) {
			int flag=0;
			for(int i=0;i<arr1.length;i++) {
				if(arr1[i]!=arr2[i]) {
					flag=1;
					break;
				}}
				if(flag==0) {
					System.out.println("identical array");
				}
				else {
					System.out.println("array is not identical");
				}
			
		}
		else {
			System.out.println("array is not identical");
		}

	}

}
