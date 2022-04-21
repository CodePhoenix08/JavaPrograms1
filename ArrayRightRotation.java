package com;

public class ArrayRightRotation {
	static int[] arrayRotation(int arr[],int n) {
		for(int i=1;i<=n;i++) {
			int pre =arr[0];
			arr[0]=arr[arr.length-1];
			for(int j=1;j<=arr.length-1;j++) {
				int temp=arr[j];
				arr[j]=pre;
				pre=temp;
			}
		}
		return arr;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]={1,2,3,4,5,6};
		int ans[]=arrayRotation(arr,6);
		for(int i:ans) {
			System.out.print(i+" ");
		}
	}

}
