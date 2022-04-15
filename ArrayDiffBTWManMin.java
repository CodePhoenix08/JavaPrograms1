package com;

public class ArrayDiffBTWManMin {
 public static void main(String[] args) {
	int arr[]= {1,44,55,12,13,99,100};
	int max=arr[0];
	int min=arr[0];
	for(int i =0;i<=arr.length-1;i++) {
		if(max<arr[i]) {
			max=arr[i];
		}
		
		if(min>arr[i]) {
			min=arr[i];
		}
	}
	System.out.println("maximum ele : "+max);
	System.out.println("minimum ele : "+min);
	System.out.println("diff is : "+(max-min));
}
}
