package com;

import java.util.Scanner;

public class TwoDArrayDynamicInputs {

	public static void main(String[] args) {
		Scanner ip=new Scanner(System.in);
		System.out.println("enter the no of rows");
		int row=ip.nextInt();
		System.out.println("enter the no columns");
		int col=ip.nextInt();
		int arr1[][]=new int[row][col];
		System.out.println("enter the elements");
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				arr1[i][j]=ip.nextInt();
			}
		}
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				System.out.print(arr1[i][j]+" ");
			}
			System.out.println();
		}
	}

}




