package com;

public class MatrixPaterrn5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();}
		System.out.println("=========================");
		
			for(int i=1;i<=5;i++) {
				for(int j=1;j<=5;j++) {
					if(i==j) {
						System.out.print("* ");
						break;
						}
					System.out.print("* ");	
					}
			System.out.println();}

	}

}
