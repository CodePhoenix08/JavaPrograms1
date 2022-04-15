package com;

import java.util.Scanner;

public class Pattern7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner ip=new Scanner (System.in);
			System.out.println("idiot plz give ood number 5 or above");
			int n= ip.nextInt();
			for(int i=1;i<=n;i++) {
				for(int j=1;j<=n;j++) {
					if( i==1 || i==n ||j==1||j==n||i==j||i+j==n+1) {
					System.out.print("* ");
					}
					else {
						System.out.print("  ");
					}
				}
				System.out.println();
			}
	}

}
