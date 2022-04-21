package com;

public class SumOfDiagonal2DArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][]= {{44,2,3},{4,55,6},{7,8,99}};
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				if(i==j) {
					sum+=arr[i][j];
				}
			}
		}
		System.out.println("sum of diagonal in array : "+sum);

	}

}
