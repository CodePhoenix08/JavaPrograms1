package com;

public class ArrayKeyIndex {
public static void main(String[] args) {
	int arr[]= {1,2,33,45,62,8};
	int key=662;
	int flag=0;
	for(int i=0;i<=arr.length-1;i++) {
		if(arr[i]==key) {
			System.out.println("key : "+key+" index no :"+i);
			flag=1;
			break;
		}
	}
	if(flag==0) {
		System.out.println("key not found");
	}
	
}
}
